//## Part I - Interfaces and Abstract Classes.

// 1- Create an example of, a Class and an Interface, and allow to Implement the Interface methods and variables in the Class.
// 2- Create an example of, a Class and an Abstract Class, and Implement different methods, variables, and Abastract methods from the Abstract Class

fun main() {

    //----- 1- INTERFACES---------
    val lion = Lion("Simba", 10)
    val gorilla = Gorilla("Keshak", 20)

    //----- 2- ABSTRACTS---------
    val dolphin = Dolphin("Wheely", 17)
}

//----- 1- INTERFACES---------
interface AnimalInterface{
    val animalName: String
    val animalAge: Int

    fun animalInfo()
    fun animalSound()
}

class Lion(override val animalName: String, override val animalAge: Int): AnimalInterface{

    init {
        animalInfo()
        animalSound()
        println("------------------------")
    }

    override fun animalInfo() {
        println("$animalName is a lion. \nHe is $animalAge years old. \n")
        println("Lifespan \nIn captivity: 30 years \nIn the wild: 15 years")
    }

    override fun animalSound() {
        println("Lions roars")
    }
}

class Gorilla(override val animalName: String, override val animalAge: Int): AnimalInterface{

    init {
        animalInfo()
        animalSound()
        println("------------------------")
    }
    override fun animalInfo() {
        println("$animalName is a gorilla. \nHe is $animalAge years old. \n")
        println("Lifespan \nIn captivity: 45-50 years \nIn the Ocean: 40 years")
    }

    override fun animalSound() {
        println("Gorillas belches")
    }
}

//------- 2-ABSTRACTS--------
abstract class AnimalAbstract(private val animalName: String, private val animalAge: Int){

    init {
        animalInfo()
        animalSound()
        println("------------------------")
    }
    fun animalInfo(){
        println("Name: $animalName \nAge: $animalAge")
    }

    abstract fun animalSound()
}

class Dolphin(private val animalName: String, private val animalAge: Int): AnimalAbstract(animalName, animalAge) {

    init {
        animalInfo()
        animalSound()
        println("------------------------")
    }
    override fun animalSound() {
        println("Dolphin whistles")
    }
}
