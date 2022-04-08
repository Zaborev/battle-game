enum class Ammo(
    private val damageValue: Int,
    private val critChance: Int,
    private val critCoe: Int
) {
    PEWPEW(100,15, 2),
    PIFPIF(150,25, 3),
    PAFPAF(120,20, 5);

    fun takeDamage(bullet:Ammo): Int {
        val damage: Int
        return if (bullet.critChance.onChance()) {
            damage = damageValue*critCoe
            damage
        } else damageValue
    }
}