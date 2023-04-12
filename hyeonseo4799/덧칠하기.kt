fun solution(n: Int, m: Int, section: IntArray): Int {
    var count = 0
    var paint = 0

    for (i in section.indices) {
        if (section[i] > paint) {
            paint = section[i] + m - 1
            count++
        }
    }
    return count
}