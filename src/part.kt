abstract class person {
    open fun walk() {}
    abstract fun speak()
    abstract fun look()

}

class Nora:person() {

    override fun walk() {
        println("Hi Iam Nora I can n't walk")
    }

    override fun speak() {
        println("but i can speek")

    }

    override fun look() {
        println("and I can look")
    }


}

class Rahaf:person() {

    override fun walk() {
        println("Hi Iam Rahaf I can walk")
    }

    override fun speak() {
        println(" I can speek")

    }

    override fun look() {

        println("and I can look")
    }
}

fun main() {
    val Nora=Nora()
    val Rahaf=Rahaf()

    Nora.walk()
    Nora.speak()
    Nora.look()

    Rahaf.walk()
    Rahaf.speak()
    Rahaf.look()

}

