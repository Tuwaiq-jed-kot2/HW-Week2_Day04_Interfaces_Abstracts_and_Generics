/*
Abstract example
Abstract class Numbers has two function
only one function will be implemented to class NumberTest
and this function will compare between two integers and print result

 */

fun main() {
    val n1 = NumbersTest(1, 1)
    n1.numCompare()
}


abstract class Numbers() {
    fun add(num1: Int, num2: Int) {
        println("$num1 + $num2 = ${num1 + num2}")
    }

    abstract fun numCompare()
}

class NumbersTest(var number1: Int, var number2: Int) : Numbers() {
    override fun numCompare() {
        when {
            number1 > number2 -> println("$number1 is Bigger than $number2")
            number1 < number2 -> println("$number2 is Bigger than $number1")
            number1 == number2 -> println("$number1 is equal to $number2")
        }

    }

}
