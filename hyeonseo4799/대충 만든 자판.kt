fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
    val index = mutableListOf<Int>()
    var min: Int

    targets.forEach { target ->
        var count = 0
        var isEnabled = true

        target.forEach { alphabet ->
            min = 101
            keymap.forEach { key ->
                key.indexOfFirst { it == alphabet }.let {
                    if (it < min && it != -1) min = it
                }
            }
            if (min != 101) count += min + 1 else isEnabled = false
        }
        if (isEnabled) index.add(count) else index.add(-1)
    }
    return index.toIntArray()
}