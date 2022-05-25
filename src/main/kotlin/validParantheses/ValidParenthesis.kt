package validParantheses

import java.util.*

class ValidParenthesis {
    fun validParenthesis(s: String): String{
        val stack= Stack<Char>()
        for (char in s){
            when (char){
                '(','{','['-> stack.push(char)
                ')','}',']'-> {
                    if(stack.isEmpty()){
                        return "false"
                    }
                    if (char==')' && stack.peek()=='('|| char=='}'&& stack.peek()=='{' || char==']' && stack.peek()=='['){
                        stack.pop()
                    }
                }
                else -> return "given string has characters which are not '[',']','{','}','(',')'"
            }
        }
        if(stack.isEmpty()){
            return "true"
        }
        return "false"
    }
}
