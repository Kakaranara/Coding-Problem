package array_and_hashing

/**
 * Should be efficient!
 * Watch time limit.
 * @param nums can be 10^5
 */

fun containsDuplicate(nums: IntArray): Boolean {
    val set = mutableSetOf<Int>()
    nums.forEach {
        if(!set.add(it)){
            return  true
        }
    }

    return false
}
