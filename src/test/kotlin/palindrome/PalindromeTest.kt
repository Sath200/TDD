package palindrome

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class PalindromeTest {
    private val palindrome=Palindrome()
    @Test
    fun `should check if the given palindromic digit is a palindrome`(){
        assertEquals(true,palindrome.palindrome(121))
    }
    @Test
    fun `should check if the given non-palindromic digit is not a palindrome`(){
        assertEquals(false,palindrome.palindrome(234))
        assertEquals(false,palindrome.palindrome(10))
    }

    @Test
    fun `should check if the given negative digit is not a palindrome`() {
        assertEquals(false,palindrome.palindrome(-121))
    }
}