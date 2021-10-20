abstract class Bank(val nameOfCustomer:String,val customerId:Int){
    fun Info(){
        println("your user name is:$nameOfCustomer \n  your Id number is:$customerId ")
    }

    abstract fun logIn():String
}

fun main() {

    val user=BankAcount("A",122)
    user.Info()
    println(user.logIn())
}