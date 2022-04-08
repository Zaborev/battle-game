import Weapons.pistolet

class NoobWar(
    override val maxXP: Int = 1500,
    override val mastery: Int = 50,
    override val weapon: AbstractWeapon = pistolet(),
    override var currentXP: Int= 1500,
    override val dodgeChance: Int = 5,
    override var rang: String = "Нуб"
) : AbstractWarrior() {
}