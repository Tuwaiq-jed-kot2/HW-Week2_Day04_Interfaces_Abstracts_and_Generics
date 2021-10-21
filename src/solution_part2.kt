/*---------------------------------Part I-------------------------------------*/
/*Answer Q1:------------------------------------------------------------------*/
fun main() {
    val x =Different("First Generic")
    x.Merge(1234," numbers")
}


class Different<D> (element:D){
    init {
        println(element)
    }
    fun <D> Merge(element1:D,element2: D) {
        println("$element1"+"$element2")
    }
}