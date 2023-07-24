package array_and_hashing

fun twoSum(nums: IntArray, target: Int): IntArray {
    val indexAnswers = hashMapOf<Int, Int>()
    nums.forEachIndexed{index, element ->
        val diff = target - element
        if(diff in indexAnswers){
            return intArrayOf(indexAnswers[diff]!!, index)
        }
        indexAnswers[element] = index
    }
    return intArrayOf(0,0)
}