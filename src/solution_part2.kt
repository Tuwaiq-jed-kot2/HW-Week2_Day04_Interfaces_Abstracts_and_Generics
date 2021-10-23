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
    val i =OutKey(66)
    println(i)
}

//--------------2----------------------------
class OutKey<out T>(val item:T){//out keyword
    fun get():T{
        return item
    }
}

/*

The out keyword:
 modifier is called a variance annotation, and since it is provided at the type parameter declaration site, it provides declaration-site variance.

The in Keyword :
if we have an opposite situation meaning that we have a reference of type T and we want to be able to assign it to the subtype of T.
We can use the in keyword on the generic type if we want to assign it to the reference of its subtype.
 */