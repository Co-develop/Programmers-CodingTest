fun solution(number: Int, limit: Int, power: Int): Int {
    var weight = 0

    for (i in 1..number) {
        var count = 0

        for (j in 1..Math.sqrt(i.toDouble()).toInt()) {
            if (i % j == 0) {
                count += j.toDouble().let { if (i / it == it) 1 else 2 }
            }
        }
        weight += if (count > limit) power else count
    }
    return weight
}