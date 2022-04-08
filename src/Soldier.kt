import Weapons.sniper

class Soldier(
    override val maxXP: Int = 2000,
    override val mastery: Int = 60,
    override val weapon: AbstractWeapon = sniper(),
    override var currentXP: Int = 2000,
    override val dodgeChance: Int = 10,
    override var rang: String = "Солдат"
) : AbstractWarrior() {
}