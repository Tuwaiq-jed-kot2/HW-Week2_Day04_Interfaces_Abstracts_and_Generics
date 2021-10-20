
interface Company {

    fun getExperience(startYear: Int, yearNow: Int): Int

    fun getSalary(startYear: Int, yearNow: Int): Int
}


class Employee(var name: String, var job: String): Company {


    override fun getExperience(startYear: Int, yearNow: Int): Int {
        return yearNow - startYear
    }

    override fun getSalary(startYear: Int, yearNow: Int): Int {
        print("$name's salary is: ")
        return if (getExperience(startYear, yearNow) <= 2) {
            8000
        } else if (getExperience(startYear, yearNow) in 3..6) {
            12000
        } else if (getExperience(startYear, yearNow) in 7..10){
            17000
        } else {
            20000
        }
    }
}

abstract class Drinks {
    abstract var name: String
    abstract var price: Int

    fun drinkInfo() {
        println("The drink name is $name")
    }

    abstract fun isCold(ice: Boolean)
}

class Coffee: Drinks(){

    override var name: String = "Latte"
    override var price: Int = 25

    override fun isCold(ice: Boolean) {
        if (ice) {
            println("The coffee is still cold")
        } else {
            println("Your drink is getting warm")
        }
    }
}

fun main() {

    //interface
    val person = Employee("Rajwa", "App Developer")
    println("${person.name}'s experience years are: "+ person.getExperience(2018, 2021))
    println(person.getSalary(2015, 2021))

    println()

    //abstract
    val drink = Coffee()
    drink.drinkInfo()
    drink.isCold(true)
}