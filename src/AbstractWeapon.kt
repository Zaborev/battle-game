abstract class AbstractWeapon(
    val maxBullet: Int,
    val fireType: FireType,
    val magazine: Stack<Ammo>
) {
    val magazineIsEmpty get() = magazine.isEmpty()

    fun createBullet(): Ammo {
        val pewBullet: Ammo = Ammo.PEWPEW
        val pifBullet: Ammo = Ammo.PIFPIF
        val pafBullet: Ammo = Ammo.PAFPAF
        return when ((1..3).random()) {
            1 -> pewBullet
            2 -> pifBullet
            3 -> pafBullet
            else -> {
                pewBullet
            }
        }
    }

    fun reCharge(): Stack<Ammo> {
        val bullet = createBullet()
        for (i in 1..this.maxBullet) {
            magazine.push(bullet)
        }
        return magazine
    }

    fun getBullet():List<Ammo> {
        val listAmmo:MutableList<Ammo> = mutableListOf()
        when (fireType) {
            is FireType.SingleShot -> {
                if (magazine.isEmpty()) throw NoAmmoException()
                else magazine.pop()?.let { listAmmo.add(it) }
            }
            is FireType.MachineGun -> {
                if (magazine.item.size >= fireType.lengthFire) {
                    for (i in 1..fireType.lengthFire) magazine.pop()?.let { listAmmo.add(it) }
                } else throw NoAmmoException()
            }
        }
        return listAmmo
    }
}
