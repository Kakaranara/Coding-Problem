package array_and_hashing

fun isAnagram(s: String, t: String): Boolean {

    if (s.length != t.length) return false //efficient way

    val sList = MutableList(26) { 0 }
    val tList = MutableList(26) { 0 }

    s.toCharArray().forEach {
        val ascii = it - 'a'
        sList[ascii] = sList[ascii] + 1
    }
    t.toCharArray().forEach {
        val ascii = it - 'a'
        tList[ascii] = tList[ascii] + 1
    }

    return  sList == tList
}
