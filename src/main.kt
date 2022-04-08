import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    val battle = Battle(enter())
    println("Подготовка к сражению...")
    for (i in 1..12) {
        print(" <---> ")
        Thread.sleep(50)
    }
    println()
    battle.getCurrentProgress()
    battle.battleDone = false
    do {
        battle.buttleIteration()
    } while (!battle.battleDone)
}

fun enter(): Int {
    println("Сколько бойцов будет в командах?")
    val n: Int? = readLine()?.toIntOrNull()
    return if (n != null && n <= 0) {
        enter()
    } else n!!
}

fun Int.onChance(): Boolean {
    return Random.nextInt(0..101) < this
}

class NoAmmoException: Throwable("Не достаточно патронов")