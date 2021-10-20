class Genter<G>(gen: G){
    fun addItem(item:G){
        println(item)
    }
}

fun main() {
    val ggg=Genter("number")
    ggg.addItem("one,two,three,four,five.six")
}