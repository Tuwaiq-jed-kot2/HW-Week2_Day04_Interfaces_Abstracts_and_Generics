interface MyInterface {
    // abstract //
    val prop: Int

    val propertyWithImplementation: String
        get() = "foo"

    fun foo()
}

class Child : MyInterface {

    // Assiging val abstract variable of interface //

    override val prop: Int = 29

    override fun foo()
    {

        // Implementing an abstract method of interface //

        println("foo $prop")
    }
}

fun main()
{

    var child=Child()
    child.foo()

}

 //// Part2 abstract Class //

abstract class LearnEr(name: String) {

    init {
        println("My name is $name.")
    }

    fun displayCourse(cor: String) {
        println("My course is --> $cor")
    }

    abstract fun displayStd(description: String)
}

class Student(name: String): LearnEr(name) {

    override fun displayStd(description: String) {
        println(description)
    }
}

fun main(args: Array<String>) {
    val rakan = Student("Rakan")
    rakan.displayStd("I'm learning Kotlin.")
    rakan.displayCourse("Kotlin")
}