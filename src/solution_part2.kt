class Genterstring<G>(gen: G){
    fun numSe(item:G){
        println(item)
    }
}
class Genternumber <A>(gen: A){
    fun nnm(itemName:A){
        println(itemName)
    }
}
class GenterDou <D>(gen: D){
    fun numD(itemDou:D){
        println(itemDou)
    }
}







fun main() {
    val SSS = Genterstring("string ")
    SSS.numSe("one,two,three,four,five.six")
    val aaa=Genternumber(1)
    aaa.nnm(515)
    val DDD=GenterDou(10.0)
    DDD.numD(20.0)}