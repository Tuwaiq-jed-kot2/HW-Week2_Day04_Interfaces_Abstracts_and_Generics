interface Animal{
    fun eat(){
        println("your animal eats")
    }
}

class Cat:Animal{
    override fun eat (){
        super.eat()

        println("fish")
    }
}


fun main() {
    val Cat= Cat()
    Cat.eat()
}

