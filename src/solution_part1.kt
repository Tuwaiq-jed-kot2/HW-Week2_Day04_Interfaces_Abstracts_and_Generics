interface  open class Employee (val firstName: String, val lastName: String) {

     open fun fullName(): String {
        return lastName + firstName
    }
}
class Programmer(firstName: String, lastName: String) : Employee(firstName, lastName) {

    override fun fullName (): String {
        return  ("Welcome to our company")
    }
}

fun main() {
   var p= Programmer("basher", "Alzah")
   println( p.fullName())
}