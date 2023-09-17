package array_and_hashing

fun groupAnagrams(strs: Array<String>): List<List<String>> {

    val sortedStrs = strs.map { it.toCharArray().sorted().joinToString("") }

    val answerList = mutableListOf<List<String>>()
    val strsMap = hashMapOf<String, MutableList<String>>()

    sortedStrs.forEachIndexed { index, s ->
        if (strsMap[s] == null) {
            strsMap[s] = mutableListOf(strs[index])
        } else {
            strsMap[s]!!.add(strs[index])
        }
    }

    for ((key, value) in strsMap.entries) {
        answerList.add(value)
    }

    return answerList
}