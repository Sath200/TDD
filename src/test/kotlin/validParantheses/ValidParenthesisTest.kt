package validParantheses

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ValidParenthesisTest {
    private var validParenthesis= ValidParenthesis()
    @Test
    fun `should check if the given valid string is valid`(){
        assertEquals("true",validParenthesis.validParenthesis("[{}]"))
        assertEquals("true",validParenthesis.validParenthesis("()"))
        assertEquals("true",validParenthesis.validParenthesis("(){}[]"))

    }
    @Test
    fun `should check if the given invalid string in invalid`(){
        assertEquals("false",validParenthesis.validParenthesis("[{]}"))
        assertEquals("false",validParenthesis.validParenthesis("()}"))
        assertEquals("false",validParenthesis.validParenthesis("({)}"))
    }
    @Test
    fun `should check if the given string consists only the allowed parantheses `(){
        assertEquals("given string has characters which are not '[',']','{','}','(',')'",validParenthesis.validParenthesis("[]2"))
    }

}