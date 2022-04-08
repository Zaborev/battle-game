class Battle(count: Int) {
    private val team1 = Team(count).createTeam(count)
    private val team2 = Team(count).createTeam(count)
    var battleDone: Boolean = false

    fun getCurrentProgress() {
        BattleState.Progress(team1, team2).currentProgress()
    }

    fun buttleIteration() {
        println("Игрок команды 1 атакует:")
        team2[0].takeDamage(team1[0].attack(team2[0]))
        if (!team2[0].isKilled) { // Если не убит боец второй команды, тогда он атакует
            println("Игрок команды 2 атакует:")
            team1[0].takeDamage(team2[0].attack(team1[0])) //Первый игрок первой команды получает урон от первого игрока второй команды
        } else {
            println("Игрок команды 2 УБИТ!")
            team2.remove(team2[0])
            if (team2.size!=0) { //Если вторая команда не пустая, атакует следующий боец второй команды
                println("Атакует следующий игрок второй команды:")
                team1[0].takeDamage(team2[0].attack(team1[0]))
            }
            else BattleState.FirstWin.firstWin()
        }
        if (team1[0].isKilled) {
            team1.remove(team1[0])
            println("Игрок команды 1 УБИТ>!")
        }
        if (team1.isEmpty()) {
            battleDone = true
            BattleState.SecondWin.secondWin()
        } else {
            if (team2.isEmpty()) {
                battleDone = true
                BattleState.FirstWin.firstWin()
            } else BattleState.Progress(team1, team2).currentProgress()
        }
    }
}
