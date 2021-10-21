fun main() {
    val cat = Cats()
    println(cat.nameOfAnimal)
    println(cat.classOfAnimal)
    println(cat.animalGenus)
    println(cat.lifeSpanOfAnimal)
    cat.info()
    cat.eat()

}

 interface Animals{

     var nameOfAnimal: String
     var classOfAnimal: String
     var lifeSpanOfAnimal: String
     var animalGenus: String

     fun eat() {}

     fun info() {}

   }


class Cats : Animals {

    override var nameOfAnimal: String = " Cat"

    override var classOfAnimal: String = " Mammals"

    override var lifeSpanOfAnimal: String = "25 years"

    override var animalGenus: String = "Feils"


    override fun info() {
        println("The animal is a $nameOfAnimal")
        println("The animal class  $classOfAnimal")
        println("The lifespan is $lifeSpanOfAnimal")
        println("The animal genus is $animalGenus")
        super.info()
    }


    override fun eat() {
        println(" $nameOfAnimal is classified as carnivore animal so it eats meat  ")
        super.eat()
    }
}








