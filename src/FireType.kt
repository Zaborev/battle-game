sealed class FireType {
    object SingleShot : FireType()
    data class MachineGun(val lengthFire: Int) : FireType() {
    }
}