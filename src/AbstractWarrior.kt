abstract class AbstractWarrior : Warrior {
    abstract val maxXP: Int
    abstract val mastery: Int
    abstract val weapon: AbstractWeapon
    abstract var currentXP: Int
    abstract var rang: String
    override var isKilled: Boolean = false
    fun attack(warrior: AbstractWarrior): Int {
        var currentDamage = 0
        var currentListAmmo: List<Ammo> = listOf()
        try {
            currentListAmmo = this.weapon.getBullet()
        } catch (e: NoAmmoException) {
            println("Перезарядка оружия и пропуск хода")
        } finally {
            this.weapon.reCharge()
        }

        if (this.weapon.magazineIsEmpty) {
            println("Перезарядка оружия и пропуск хода")
            this.weapon.reCharge()
        } else {
            currentListAmmo.forEach {
                if (this.mastery.onChance() && !warrior.dodgeChance.onChance()) {
                    currentDamage += it.takeDamage(it)
                    println("Воин попал. Нанесен урон: ${it.takeDamage(it)}")
                } else println("Воин промазал или соперник увернулся")
            }
        }
        return currentDamage
    }

    override fun takeDamage(takenDmg: Int): Int {
        if (takenDmg >= this.currentXP || (currentXP - takenDmg) <= 0) this.isKilled = true
        else this.currentXP -= takenDmg
        return this.currentXP
    }
}