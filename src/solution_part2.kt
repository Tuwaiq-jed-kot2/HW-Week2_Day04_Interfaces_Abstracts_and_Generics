//PartII Q1

class Grocery<T> (){


    fun groceryInfo(numberOfItems: T, types: T) =  println("$numberOfItems, $types")

}

fun main() {

    val y : Grocery<String> = Grocery()

    y.groceryInfo("10","Yogurt")


    val x : Grocery<Any> = Grocery()

    x.groceryInfo(20,"Orange juice")
    //out
    val r = MyAge("my age is 24")

    println(r.ageInfo())

    val c = MyAge(30)

    println("my age is ${c.ageInfo()}")

    //in

    val numbers: Numbers<Any> = Numbers()

    numbers.twoNumbers(4,"four")


}


//PartII Q2
//(Out - covariant) we can use generic type as output(return type) in functions

class MyAge<out T>(private val age: T){

    fun ageInfo(): T =  age


}


//(In - contravariance) we can use generic type as input(parameters) in functions

class Numbers<in T>{


    fun twoNumbers(num1: T, num2: T) = println("first number is $num1, second number is $num2")


}