
interface Animal{

    var animalName:String

    fun sound():String

    fun animalInfo(){

        println(animalName)
    }
}


class Cat(override var animalName: String) :Animal{

    init {

        animalInfo()
    }

    override fun sound(): String {

        return "The cat sound is Meow"

    }

}

fun main() {

    val ani = Cat("Cat")
    println(ani.sound())
}