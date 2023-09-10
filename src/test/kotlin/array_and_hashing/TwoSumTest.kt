package array_and_hashing

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TwoSumTest {

    @Test
    fun case1(){
        val nums = intArrayOf(2,7,11,15)
        val target = 9
        val result = twoSum(nums, target)
        val expected = intArrayOf(0,1)

        Assertions.assertArrayEquals(expected, result)
    }

    @Test
    fun case2(){
        val nums = intArrayOf(3,2,4)
        val target = 6
        val result = twoSum(nums, target)
        val expected = intArrayOf(1,2)

        Assertions.assertArrayEquals(expected, result)
    }

    @Test
    fun case3(){
        val nums = intArrayOf(3,3)
        val target = 6
        val result = twoSum(nums, target)
        val expected = intArrayOf(0,1)

        Assertions.assertArrayEquals(expected, result)
    }
}