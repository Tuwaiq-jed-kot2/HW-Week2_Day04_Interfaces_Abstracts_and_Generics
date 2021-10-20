//## Part II - Generics.
//---
//- Create a Generic Class example with different type variances
//- Create three Generic Classes examples, one with `Where`, one with `Out` keyword, and the third with `In` keyword

fun main() {
    val op1 = Operation("str", "ing")
    val op2 = Operation(2,2)
    val op3 = Operation(3.5, 1.5)
    val op4 = Operation("str", 1)
    println("--------------------------------------")

    //Where
    val genTwo = GenericTwo("This must be a string")
    genTwo.printing()
    println("--------------------------------------")

    //Out
    val genThree = GenericThree(2.2)
    println(genThree.get())
    println("--------------------------------------")

    //In
    val genFour = GenericFour<Double>()
    println(genFour.printing(3.3))
}
class Operation<T>(val itemOne: T, val itemTwo: T){

    init {
        addingItems()
    }

    fun addingItems(){
        if(itemOne is String && itemTwo is String) println("The to string combined: \n${itemOne + itemTwo}")
        else if(itemOne is Int && itemTwo is Int) println("The to integers combined: \n${itemOne + itemTwo}")
        else if(itemOne is Double && itemTwo is Double) println("The to doubles combined: \n${itemOne + itemTwo}")
        else if(itemOne is Float && itemTwo is Float) println("The to floats combined: \n${itemOne + itemTwo}")
        else println("Type not supported")
    }
}

//Where
class GenericTwo<T>(val item: T)
        where T: String{
            fun printing(){
                println("The item is: $item")
            }
}

//Out
//If the generic class only uses the generic type as output of its functions, we use out
class GenericThree<out T>(private val num: T){
    fun get(): T{
        return num
    }
}

//In
//If the generic class only uses the generic type as input of its functions, we use in.
class GenericFour<in T>{

    fun printing(value: T): String{
        return "I got $value"
    }
}

