fun solution(players: Array<String>, callings: Array<String>): Array<String> {
    return players.associateBy({ it }, { players.indexOf(it) }).toMutableMap().let { playersMap ->
        players.also {
            callings.forEach { calling ->
                val playerIdx = playersMap[calling]!!
                val temp = players[playerIdx]

                playersMap[calling] = playersMap[calling]!!.minus(1)
                playersMap[players[playerIdx - 1]] = playersMap[calling]!!.plus(1)
                players[playerIdx] = players[playerIdx - 1]
                players[playerIdx - 1] = temp
            }
        }
    }
}