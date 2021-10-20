/*
in is used if you want to treat the value which has return type of T to be an input value
out is used if you want to treat the value which has return type of V to be an output value
where is used if you want to restrict the type to a certain predefined type

the code below might make no sense, but I tried my best :(
 */


class Quiz <in T , out V> (val answer: @UnsafeVariance T, val  score :V ){
    fun question (){
        println("your answer is $answer")
    }

    fun correction ():V{
        return score
    }
}

class Car <K>(val carName: K) where K :String {
    fun naming(){
        println("your car name is $carName")
    }

}

fun main() {
    val quiz = Quiz(1917,7.5)
    val car = Car("Cerato")

    quiz.question()
    println(quiz.correction())

    car.naming()
}