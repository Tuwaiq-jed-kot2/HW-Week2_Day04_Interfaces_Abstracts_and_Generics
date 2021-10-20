class BankAcount(val myName:String,val myIdNumber:Int):Bank("rwan",122){
    override fun logIn(): String {
        val myUserName="A1 \n"
        val mypassward=68676
        val informatin="your user name of your account:$myUserName and the password :$mypassward "
        return (informatin)
    }
}