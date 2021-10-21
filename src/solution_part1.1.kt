fun main() {

    val accounts = mutableMapOf("user1234" to 2343.56, "mohammedf" to 403323.21,
        "ranaowaidhi" to 120.2)

    println("Enter Your Username:")
    val username = readLine()?.lowercase()

    if (accounts.contains(username)){

        val currentAmount = accounts[username]

        val operation = Account(currentAmount)

        println("Your Current Amount: $currentAmount")

        println("Press 1 to Withdraw\nPress 2 to Deposit\nPress 0 to Exit")
        var op = readLine()

        while (op == "1"){
            println("Enter Withdraw Amount:")
            val wAmount = readLine()?.toDouble()!!

            if (wAmount > currentAmount!!){
                println("There is not enough amount in your account!")
                println("Your Current Amount: $currentAmount")
            }else {
                val cAmount = operation.withdraw(wAmount)
                println("The operation completed successfully\nYour current amount is: $cAmount")
                println("Press 1 to Withdraw\nPress 2 to Deposit\nPress 0 to Exit")
                op = readLine()
            }
        }

        while (op == "2"){
            println("Enter Deposit Amount:")
            val dAmount = readLine()?.toDouble()!!

            val cAmount = operation.deposit(dAmount)
            println("The operation completed successfully\nYour current amount is: $cAmount")
            println("Press 1 to Withdraw\nPress 2 to Deposit\nPress 0 to Exit")
            op = readLine()
        }

        if (op == "0" ){
            println("Thank you, Goodbye!")
        } else{
            println("Wrong chose!")
            println("Press 1 to Withdraw\nPress 2 to Deposit\nPress 0 to Exit")
            op = readLine()
        }
    } else {
        println("Wrong username, System Exit!")
    }
}

interface BankAccount {

    val currentAmount: Double?

    fun withdraw(amount:Double):Double

    fun deposit(amount:Double):Double

}

class Account(override val currentAmount: Double?):BankAccount{

    override fun withdraw(amount:Double): Double{
        return currentAmount!! - amount
    }

    override fun deposit(amount:Double): Double {
        return currentAmount!! + amount
    }

}