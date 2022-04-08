sealed class BattleState {
    class Progress(private val team1: MutableList<AbstractWarrior>, private val team2: MutableList<AbstractWarrior>) :
        BattleState() {
        fun currentProgress() {
            var allHpteam1 = 0
            var countTeam1 = 0
            var allHpteam2 = 0
            var countTeam2 = 0
            var setupTeam1 = ""
            var setupTeam2 = ""
            team1.forEach {
                allHpteam1 += it.currentXP
                countTeam1++
                setupTeam1 += "${it.rang} "
            }
            team2.forEach {
                allHpteam2 += it.currentXP
                countTeam2++
                setupTeam2 += "${it.rang} "
            }
            return println("Текущее состояние битвы:\nЖивых воинов в команде 1: $countTeam1, Запас здоровья: $allHpteam1, Состав команды: $setupTeam1\nЖивых воинов в команде 2: $countTeam2, запас здоровья: $allHpteam2, Состав команды: $setupTeam2")
        }
    }

    object FirstWin : BattleState() {
        fun firstWin() {
            println("Первая команда победила!")
        }
    }

    object SecondWin : BattleState() {
        fun secondWin() {
            println("Вторая команда победила!")
        }
    }
}