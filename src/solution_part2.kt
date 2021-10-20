class Genter<G>(gen: G){
    fun subtime(item:G){
        println(item)
    }
}

fun main() {
    val ggg=Genter("number")
    ggg.subtime("one,two,three,four,five.six")
}