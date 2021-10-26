//interFaces
//1
interface Color{

    var colorA:String

    fun colorst():String
}
class Colorss(override var colorA:String) : Color{

    fun colors(): String {
        println("black ")
        return " $colorA  "
    }

    override fun colorst(): String {
        println("your colors is $colorA black")
        return "$colorA"
    }

}

fun main() {
    var coll = Colorss("blackk")
    println(coll.colorst())
}

//2

abstract class colors1(var colorsA: String,var colosB: String){

    fun colorsType(){
        println("two colors ")
        println(" $colorsA , $colosB ")
    }

    abstract fun colorT():String

}

class Colors0():colors1("black","pink"){
    override fun colorT(): String {
        return " $colorsA  $colosB"
    }

}

fun main() {

    var col = Colors0 ()
    println(col.colorsType())

}