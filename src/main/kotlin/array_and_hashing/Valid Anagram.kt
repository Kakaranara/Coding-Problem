package array_and_hashing

fun isAnagram(s: String, t: String): Boolean {
    val countS = hashMapOf<Char, Int>()
    val countT = hashMapOf<Char, Int>()

    if (s.length != t.length) {
        return false
    }

    s.forEachIndexed { index, element ->
        countS[s[index]] = (countS[s[index]] ?: 0) + 1
        countT[t[index]] = (countT[t[index]] ?: 0) + 1
    }

    countS.forEach(::println)
    countT.forEach(::println)

    return countS == countT
}
