                        /***** Q2 Part 1 solution.*****/

class GEN<Z>(item: Z, item1: Z, item2: Z) {
    init {
        println(item)       /***** Generic Class that have 3 parameter with different type of variances.*****/
        println(item1)
        println(item2)
    }
}

fun main() {
    val A = GEN(1,5.5 , "azzam")        /***** testing the Generic Class trying to use 3 different type of variances.*****/
}



