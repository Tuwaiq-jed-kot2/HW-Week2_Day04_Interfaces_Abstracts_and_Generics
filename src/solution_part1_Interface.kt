/*
interface example
interface Reverse has two function wordReverse and wordUpper
all interfaces function will be Implemented in class Words
and the wordReverse function will do reverse on the input word
for the wordUpper function will change input word to UpperCase Letters
 */

fun main() {

    println("Enter Word")
    val w1 = readLine().toString()

    val m1 = Words(w1)
    m1.wordReverse()
    m1.wordUpper()

}

interface Reverse {

    fun wordReverse()
    fun wordUpper()

}

class Words(var word1: String) : Reverse {
    override fun wordReverse() {
        println(word1.reversed())

    }

    override fun wordUpper() {
        println(word1.uppercase())
    }

}
