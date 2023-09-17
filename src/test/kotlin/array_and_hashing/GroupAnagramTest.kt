package array_and_hashing

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class GroupAnagramTest {

    @Test
    fun case1() {
        val strs = listOf("eat", "tea", "tan", "ate", "nat", "bat").toTypedArray()
        val result = groupAnagrams(strs)
        val expected = listOf(listOf("bat"), listOf("nat", "tan"), listOf("ate", "eat", "tea"))


        /**
         * Add hamcrest api!
         * Need to assert contains.
         */
    }

    @Test
    fun case2() {
        val strs = arrayOf("")
        val result = groupAnagrams(strs)
        val expected = listOf(listOf(""))

    }

    @Test
    fun case3() {
        val strs = arrayOf("a")
        val result = groupAnagrams(strs)
        val expected = listOf(listOf("a"))
    }
}