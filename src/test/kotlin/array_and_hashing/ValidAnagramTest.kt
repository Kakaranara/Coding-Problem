package array_and_hashing

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ValidAnagramTest {

    @Test
    fun `case1, should true`(){
        val s = "anagram"
        val t = "nagaram"

        val result = isAnagram(s,t)
        Assertions.assertTrue(result)
    }

    @Test
    fun `case 2, should false`(){
        val s = "rat"
        val t = "car"

        val result = isAnagram(s,t)
        Assertions.assertFalse(result)
    }
}