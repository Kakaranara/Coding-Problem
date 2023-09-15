package array_and_hashing

fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = hashMapOf<Int, Int>()
    nums.forEachIndexed { index, i ->
        val diff = target - i
        if (map.containsKey(diff)) {
            return intArrayOf(map[diff]!!, index)
        } else {
            map[i] = index
        }
    }
    println(map)
    return intArrayOf(0, 0)
}