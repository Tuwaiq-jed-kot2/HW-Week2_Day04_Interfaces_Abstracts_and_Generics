/*
the code below is the same as the interface code, but two different cars in which one of them
has 4X4 driving system the other didn't so I used abstract class instead of interface
 */


abstract class Properties1 {
    abstract fun manufacturingYear ()


    abstract fun engineSize()

    open fun fourByFour() {

    }

}

class nissanMaxima (val manufacturingYear :Int ,val engineSize :Double): Properties1() {
    override fun manufacturingYear() {
        print("your car was manufactured in year: ")
        println(manufacturingYear)
    }

    override fun engineSize() {
        print("you car's engine size is: ")
        print(engineSize)
        println("  litres")
    }
}

class toyotaLandCruiser (val manufacturingYear :Int ,val engineSize :Double): Properties1() {
    override fun manufacturingYear() {
        print("your car was manufactured in year: ")
        println(manufacturingYear)
    }

    override fun engineSize() {
        print("you car's engine size is: ")
        print(engineSize)
        println("  litres")
    }

    override fun fourByFour() {
        println("your car has 4X4 system")
    }
}

fun main() {
    val maxima = nissanMaxima(2021,3.5)
    val landCruiser = toyotaLandCruiser(2021,5.7)

    maxima.manufacturingYear()
    maxima.engineSize()

    landCruiser.manufacturingYear()
    landCruiser.engineSize()
    landCruiser.fourByFour()
}