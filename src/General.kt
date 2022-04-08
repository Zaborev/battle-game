import Weapons.pulemet

class General (
     override val maxXP: Int = 4000,
     override val mastery: Int = 90,
     override val weapon: AbstractWeapon = pulemet(),
     override var currentXP: Int = 4000,
     override val dodgeChance: Int = 20,
     override var rang: String = "Генерал"
) : AbstractWarrior() {
}