/*
in the code below, I compared between two cars which both have manufacturing year and engine size
since they both have these functions I used interface to combine them and then put each car in its own class
then I called the cars and printed the properties
 */


interface Properties {
    fun manufacturingYear (){
        print("your car was manufactured in year: ")
    }

    fun engineSize(){
        print("you car's engine size is: ")
    }
}

class nissanPatrol (val manufacturingYear :Int ,val engineSize :Double): Properties {
    override fun manufacturingYear() {
        super.manufacturingYear()
        println(manufacturingYear)
    }

    override fun engineSize() {
        super.engineSize()
        print(engineSize)
        println("  litres")
    }
}

class toyotaAvalon (val manufacturingYear :Int ,val engineSize :Double): Properties {
    override fun manufacturingYear() {
        super.manufacturingYear()
        println(manufacturingYear)
    }

    override fun engineSize() {
        super.engineSize()
        print(engineSize)
        println("  litres")
    }
}

fun main() {
    val patrol = nissanPatrol(2021,5.8)
    val avalon = nissanPatrol(2021,3.5)

    patrol.manufacturingYear()
    patrol.engineSize()

    avalon.manufacturingYear()
    avalon.engineSize()
}