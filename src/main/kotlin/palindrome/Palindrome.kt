package palindrome

class Palindrome {
    fun palindrome(n: Int): Boolean{
        if (n<0){
            return false
        }
        var reverse: Int=0
        var remainder: Int=0
        var digit: Int=n
        while(digit!=0){
            remainder=digit%10;
            reverse=reverse*10+remainder
            digit /= 10
        }
        return reverse==n
    }
}