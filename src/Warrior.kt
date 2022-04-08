interface Warrior {
    var isKilled: Boolean
    val dodgeChance: Int

    fun attack(warrior: Warrior): Int {
        return 0
    }

    fun takeDamage(takenDmg: Int): Int {
        return 0
    }
}