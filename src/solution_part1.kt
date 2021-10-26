//interface part
interface Animal {
    val name :String
    fun play()
}
class Bear() :Animal {
    override val name: String = "Bear"

    override fun play() {
        println(" you cant play with Bear ")
    }
}
class Cat():Animal{
    override val name: String = "CAT"
    override fun play() {
        println(" you can play with cat")
    }
}

fun main() {
    val bear=Bear()
    bear.play()
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
        return Speed
    }
}
class Camry(val Speed:Int):Car("camry","white") {
    override fun Speed(): Int {
        return Speed
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

