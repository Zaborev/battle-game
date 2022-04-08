object Weapons {
fun pistolet(): AbstractWeapon {
        return object : AbstractWeapon(maxBullet = 12, fireType = FireType.SingleShot, magazine = Stack()) {}
    }
    fun sniper(): AbstractWeapon {
        return object : AbstractWeapon(maxBullet = 6, fireType = FireType.SingleShot, magazine = Stack()) {}
    }
    fun avtomat(): AbstractWeapon {
        return object : AbstractWeapon(maxBullet = 50, fireType = FireType.MachineGun(5), magazine = Stack()) {}
    }
    fun pulemet(): AbstractWeapon {
    return object : AbstractWeapon(maxBullet = 100, fireType = FireType.MachineGun(10), magazine = Stack()) {}
}
}

