interface BankAc {
    fun Info():String

    fun logIn():String

}

class BankAco(val myName:String, val myIdNumber:Int,val myUserName:String, val mypasward:Int):BankAc {
    override fun Info(): String {
        val informtionAc="\nyour  name of your :$myUserName and your Id number :$mypasward \n"


        return "$informtionAc"

    }

    override fun logIn(): String {
        val informtion="\nyour user name of your account:$myUserName and the password :$mypasward \n"
        return "$informtion"

    }
}


fun main() {
    val v=BankAco("A",122,"A1",1234)
    println(v.Info())
    println(v.logIn())
}
