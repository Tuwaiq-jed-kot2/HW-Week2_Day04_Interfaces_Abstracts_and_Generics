interface class Employee (val firstName: String, val lastName: String) {

     open fun fullName(): String {
        return lastName
    }
}
class Programmer(firstName: String, lastName: String) : Employee(firstName, lastName) {
override val firstName()= "welcome $firstName "
    override fun fullName (): String {
        return  firstName + lastName
    }
}

fun main() {
   var p= Programmer("basher", "Alzah")
   println( p.fullName())
}