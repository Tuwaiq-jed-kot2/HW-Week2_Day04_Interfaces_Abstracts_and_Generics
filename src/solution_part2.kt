// generic class TypesTest will accept any data type and print it

fun main() {

    TypesTest("Aaaaaaa")
    TypesTest(4545664)
    TypesTest(44.56778)
    TypesTest("bbbbb")

}

class TypesTest<W>(input: W) {
    init {
        println(input)
    }

    var list = mutableListOf<W>()

    fun print(input: W) {
        list.add(input)
        println(input)
    }

}