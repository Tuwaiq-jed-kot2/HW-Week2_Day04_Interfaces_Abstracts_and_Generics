//interface part
interface Animal {
    val name :String
    fun play()
}
class Lion() :Animal {
    override val name: String = "lion"

    override fun play() {
        println(" you cant play with loins ")
    }
}
class Cat():Animal{
    override val name: String = "CAT"
    override fun play() {
        println(" you can play with cat")
    }
}

fun main() {
    val lion=Lion()
    lion.play()
    val cat=Cat()
    cat.play()
}

//abstract part

abstract class Car(var carName:String,var carColor:String){

    fun info(){
        println("$carName$carColor")
    }

    abstract fun Speed():Int
}


class BMW(val Speed:Int):Car("BMW","red") {
    override fun Speed(): Int {
        return Speed()
    }
}
class Camry(val Speed:Int):Car("camry","white") {
    override fun Speed(): Int {
        return Speed()
    }
}

fun main() {
    val bmw = BMW(280)
    val cam = Camry(240)
    bmw.info()
    println(bmw.Speed())
    cam.info()
    println(cam.Speed())

}

