fun solution(s: String): IntArray {
    return s.mapIndexed { idx, alphabet ->
        s.substring(0, idx).indexOfLast { it == alphabet }.let { if (it == -1) it else idx - it }
    }.toIntArray()
}