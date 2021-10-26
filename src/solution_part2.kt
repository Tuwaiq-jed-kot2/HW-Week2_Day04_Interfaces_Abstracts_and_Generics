//Create a Generic Class example with different type variances

class name<T>(num: T) {

    init {
        println(num)
    }

    fun <P>number0(name:P){
        println(name)
    }

}

fun main() {
    val n1=name("n111")
    val n2=name("n222")
}
/*Create three Generic Classes examples, one with `Where` one with `Out
` keyword, and the third with `In` keyword

 out= You can use the out keyword in generic interfaces and delegates.

    where= clause in a generic definition specifies constraints on the
   types that are used as arguments for type parameters in a generic type, method,
   delegate, or local function. Constraints can specify interfaces, base classes, or require a
   generic type to be a reference, value, or unmanaged type.
    They declare capabilities that the type argument must have.

 in=  You can use the in keyword in generic interfaces and delegates


 */


