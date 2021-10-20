abstract class Edu (name: String) {

    var age: Int = 30

    fun display() {
        println("")
    }

    abstract fun displayJob(description: String)
}

class Teacher(name: String): Edu (name) {

    override fun displayJob(description: String) {
        println(description)
    }
}

fun main() {
    val t = Teacher("Anas")
    println(t.displayJob(" kotlin teacher."))
}