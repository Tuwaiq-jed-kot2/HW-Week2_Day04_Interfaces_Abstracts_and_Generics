abstract class Animal (var animalName:String,var animalSound: String){

    fun info(){
        println("$animalName $animalSound ")
    }

    abstract fun col():String


}
// عملت كلاس ابستراكت ورثت القدرات الي فيه بكلاست اخرى



class Hourse2 (var color:String):Animal("lolo","nnnn"){
    override fun col():String{
        return color
    }
}
class Mouse2 (var color: String ) :Animal("lusifer","tototo") {
    override fun col(): String {
        return animalName + animalSound
    }
}
fun main(){
    var hourse = Hourse2 ("black")
    hourse.info()
    println(hourse.col())

    var mouse2 = Mouse2("white")
    mouse2.info()
    println(mouse2.color)


}