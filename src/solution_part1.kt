
interface Animal{

    var animalName:String

    fun eat():String

    fun animalInfo() =  println("This animal is $animalName")



}


class Deer(override var animalName: String) :Animal{

    init {

        animalInfo()
    }

    override fun eat(): String = "Deer is herbivores, they eat plants"




}

fun main() {

    val animal = Deer("deer")
    println(animal.eat())
}