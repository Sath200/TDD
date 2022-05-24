package palindrome

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class PalindromeTest {
    private val palindrome=Palindrome()
    @Test
    fun `should return true if digit is palindrome`(){
        assertEquals(true,palindrome.palindrome(121))
    }
    @Test
    fun `should return false if digit is not palindrome`(){
        assertEquals(false,palindrome.palindrome(234))
        assertEquals(false,palindrome.palindrome(-121))
        assertEquals(false,palindrome.palindrome(10))
    }
}