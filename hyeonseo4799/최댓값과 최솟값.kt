fun solution(s: String): String {
    lateinit var min: String
    lateinit var max: String

    s.split(" ").forEachIndexed { index, num ->
        if (index == 0) {
            min = num
            max = num
        }
        if (min.toInt() > num.toInt())
            min = num
        if (max.toInt() < num.toInt())
            max = num

    }
    return "$min $max"
}