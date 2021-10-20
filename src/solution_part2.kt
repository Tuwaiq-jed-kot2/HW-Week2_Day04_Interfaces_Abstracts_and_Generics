// generic class TypesTest will accept any data type and print it

fun main() {

    val w1 = TypesTest("Aaaaaaa")
    val w2 = TypesTest(4545664)
    val w3 = TypesTest(44.56778)
    val w4 = TypesTest("bbbbb")

}

class TypesTest <W> (input : W){
    init {
        println(input)
    }

    var list = mutableListOf<W>()

    fun print(input: W){
        list.add(input)
        println(input)
    }

}