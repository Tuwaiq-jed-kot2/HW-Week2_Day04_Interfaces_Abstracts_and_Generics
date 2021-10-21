fun main() {

    println("\n *** welcome to Dominos pizza *** \n")
    println("menu :small pizza: 15$ , medium pizza: 30$ , large pizza: 45$ ")

    try {
        print("what is the pizza size you want ? ")
        val pizzaSize = readLine()?.lowercase().toString()
        print("How many pizza ? ")
        val amount = readLine()?.toInt()

        val newOrder = Dominos(amount, pizzaSize)

        println(newOrder.order())
        println("The total price is " + newOrder.invoice())
        println("\n *** Thank you for visiting Dominos pizza *** \n")


    } catch (e: Exception) {
        println(e.message)
    }
    println("------------------------------------------")

    val rentNovel = Novels()
    rentNovel.rent()
}

interface Restaurant {

    val pizzaSize: String
    val amount: Int?

    fun order(): String
    fun invoice(): Int

}

class Dominos(override val amount: Int?, override val pizzaSize: String) : Restaurant {


    override fun order(): String {
        return "your ordered  $amount $pizzaSize pizza"
    }

    override fun invoice(): Int {
        var totalPrice = 0

        when (pizzaSize) {

            "small" -> totalPrice = 15 * amount!!
            "medium" -> totalPrice = 30 * amount!!
            "large" -> totalPrice = 45 * amount!!

        }
        return totalPrice
    }

}
/*------------------------------------------------------------------*/

abstract class BookStore() {

    abstract val rentTime: String
    abstract fun rent()
    fun sell() {}
}

class Novels : BookStore() {

    override val rentTime = "Two weeks"

    override fun rent() {
        println("Novels are rentable for $rentTime")
    }

    val soldNovel = Novels().sell()
}



