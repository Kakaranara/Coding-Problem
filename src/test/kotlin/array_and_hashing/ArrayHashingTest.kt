package array_and_hashing

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ArrayHashingTest{

    @Test
    fun `case 1, should true`(){
        val dummyData = intArrayOf(1,2,3,1)
        val result = containsDuplicate(dummyData)

        Assertions.assertTrue(result)
    }

    @Test
    fun `case 2, should false`(){
        val dummy = intArrayOf(1,2,3,4)
        val result = containsDuplicate(dummy)

        Assertions.assertFalse(result)
    }

    @Test
    fun `case 3, should true`(){
        val dummy = intArrayOf(1,1,1,3,3,4,3,2,4,2)
        val result = containsDuplicate(dummy)

        Assertions.assertTrue(result)
    }
}