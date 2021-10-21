fun main() {

    val f1 = Apple()
    println( f1.fruitFacts())

    val f2 = Orange()
    println(f2.fruitFacts())

}

abstract class Fruits (val fruitName:String){
    abstract fun fruitFacts():MutableMap<String,String>

    fun printName() {
        println(fruitName)
    }
}

class Apple:Fruits("Apple"){

    init {
        printName()
    }

    override fun fruitFacts(): MutableMap<String, String> {
        return mutableMapOf("Vitamin C" to "7%" , "Magnesium" to "1%" )
    }

}

class Orange:Fruits("Orange"){

    init {
        printName()
    }

    override fun fruitFacts(): MutableMap<String, String> {
        return mutableMapOf("Vitamin C" to "88%%" , "Magnesium" to "2%" , "Vitamin b6" to "5%" ,
        "Calcium" to "4%")
    }

}