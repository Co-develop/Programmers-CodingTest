fun solution(ingredient: IntArray): Int {
    val builder = StringBuilder()
    var count = 0

    for (i in ingredient.indices) {
        builder.append(ingredient[i])
        builder.length.let {
            if (builder.length > 3 && builder.subSequence(it - 4, it) == "1231") {
                count++
                builder.delete(it - 4, it)
            }
        }
    }
    return count
}