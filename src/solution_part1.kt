abstract class Employee (val firstName: String, val lastName: String) {

    fun fullName(): String {
        return lastName + firstName
    }
}
class Programmer(firstName: String, lastName: String) : Employee(firstName, lastName) {

    override fun xx (): String {
        return  "$lastName"
    }
}

fun main() {
   var p= Programmer("basher", "Alzah")
   println( p.xx())
}