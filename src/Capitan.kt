import Weapons.avtomat

class Capitan(
    override val maxXP: Int = 3000,
    override val mastery: Int = 80,
    override val weapon: AbstractWeapon = avtomat(),
    override var currentXP: Int = 3000,
    override val dodgeChance: Int = 15,
    override var rang: String = "Капитан"
) :AbstractWarrior () {
}