//INTERFASE
interface Seacona{

    fun mid():Int

    fun final ():Int

    fun info ():String
    fun sum ():Int
}
class Khaled (name:String, id:Int, subject:String):Seacona{
    var midNum1:Int=9
    var midNum2: Int=10
    override fun mid(): Int {
        return midNum1+midNum2

    }
    var finalNum:Int=30
    override fun final(): Int {
        return finalNum
    }

    override fun info():String {
        return "THE SUM ${sum()}"
    }

    var result=(midNum1+midNum2)+finalNum
    override fun sum() :Int {
        return  result
    }

}

fun main() {
    val kk = Khaled("Khaled", 10, "math")
    print(kk.info())
}
