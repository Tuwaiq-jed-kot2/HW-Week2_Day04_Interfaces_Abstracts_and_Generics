                          /***** Q1 Part 1 solution.*****/

                    /***** Interface with two function.*****/

interface Vehicle {
    fun Moving(): String
    fun SpeedCalc(): Double
}
/*------------------------------------------------------------------------------*/
            /***** class to Implement the Interface methods and variables in it.*****/

class Car(val Distance: Double, val Time: Double) : Vehicle {
    override fun Moving(): String {
        return "The Car is Moving"
    }
    /*------------------------------------------------------------------------------*/
    override fun SpeedCalc(): Double {
        return Distance / Time

    }
}
    /*------------------------------------------------------------------------------*/
                               /***** Q1 Part 2 solution.*****/
               /***** Abstract Class to Implement the methods and variables in it.*****/

abstract class Abs_vehicle(){
       fun Abs_moving(){
           println("The Car is Moving in abstract mode")
}
    /*------------------------------------------------------------------------------*/
abstract fun Abs_speedcalc():Double
}
    /*------------------------------------------------------------------------------*/
class Abs_car(val distance:Double , val time:Double):Abs_vehicle(){
    override fun Abs_speedcalc():Double{
        return distance/time
   }
     }
     /*------------------------------------------------------------------------------*/
                                        /***** main function.*****/
fun main() {
val S = Car(45.2, 20.4)
println(S.Moving())                      /***** testing Q1 part 1.*****/
println(S.SpeedCalc())
   /*------------------------------------------------------------------------------*/
val c = Abs_car(45.2, 6.2)
c.Abs_moving()                           /***** testing Q1 part 2.*****/
println(c.Abs_speedcalc())
}