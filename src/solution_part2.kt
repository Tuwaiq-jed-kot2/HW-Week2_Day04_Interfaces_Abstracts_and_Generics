//I
class Gen <U> (item:U){
    init {
        println(item)
    }

}

fun main() {

    val g = Gen("Asma")
    val g1=Gen(567)
    val g2=Gen(65.9)
}
