fun main() {

    BankUser<String,Int>("A",1111)




}
class BankUser<U,I>(userName:U,Passward:I){
    init {
        println("$userName,$Passward")
    }
}