//Create a Generic Class example with different type variances

class memmber<T>(mmNumber: String)
 fun numOfEmm():String{
     return numOfEmm()
 }
class name<T:>( num:T){
    val name1 =num
   init {
       println(name1)
   }
    fun x(y:T<out num>):Boolean=box{
        it.x()
    }

}
/*Create three Generic Classes examples, one with `Where` one with `Out
` keyword, and the third with `In` keyword
 */


fun main() {
    val s:name<String>=name("99")
    val n:mumber<Int>=name (0)
    val x=y(mutableListOf(num1().num1()))
}
// i tried ..,


