class Team(var value: Int) {
    val teamList: MutableList<AbstractWarrior> = mutableListOf()
    fun createTeam(value: Int): MutableList<AbstractWarrior> {
        for (i in 1..value) {
            if (10.onChance()) teamList.add(General())
            else {
                if (25.onChance()) teamList.add(Capitan())
              else {
                  if (40.onChance()) teamList.add(Soldier())
                    else teamList.add(NoobWar())
              }
            }
        }
        return teamList
    }
}
