package array_and_hashing

fun containsDuplicate(nums: IntArray): Boolean {
    val set = mutableSetOf<Int>()
    nums.forEach {
        if (it in set) {
            return true
        }
        set.add(it)
    }
    return false
}
