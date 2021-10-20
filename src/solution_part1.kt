//interFaces
//1
interface Name {

   fun pp():String

}

class gg:Name{

 override fun pp(): String ="black"

}

//2

abstract class colors(val colorA:String, val colorB:String){
    fun info(){
    println("$colorA ,$colorB")
    }
abstract fun addColor():String
}
class none():colors("yellow","black"){
    override fun addColor(): String {
      return ("red")
    }

}

fun main() {
    val ll=gg()
    println("black")
    val col =colors()
    col.info()
    println(col.addColor())

}