interface Seaconah{
    fun mid():Int
    fun final ():Int
    fun info ():String
    fun sum ():Int
}
class Aimean (name:String, id:Int, subject:String):Seaconah{
    var midNum1:Int=8
    var midNum2: Int=8
    override fun mid(): Int {
        return midNum1+midNum2

    }
    var finalNum:Int=20
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
    val AA = Aimean("Aimean", 5, "math")
    print(AA.info())
}