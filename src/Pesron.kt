fun main() {


    var w = Person.Woman()
    w.info()


}

abstract class Person(var name: String, var id: Int, var ethnisity: String, var religion: String) {


    abstract fun practise()

    abstract fun speak()

    abstract fun info()


    class Woman : Person("Hala", 0, "Caucasian", "Muslim") {

        override fun practise() {
            println("$name pray five times a day")
        }

        override fun speak() {
            println("Hi !! hello")
        }

        override fun info() {
            println("Your name is $name")
            println(" Your Id number $id ")
            println(" I am originated from $ethnisity")
            println(" I am $religion")

        }
    }


}







