abstract class Season(val name:String, val id:Int, val subject:String){

    abstract  fun mid(): Int

    abstract fun final(): Int

    abstract fun info(): String

    abstract fun sum(): Int
}
class Khaled1() :Season  (name = "khaled",10,"mnath"){
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
    val kkk=Khaled1()

    println(kkk.info())
}
