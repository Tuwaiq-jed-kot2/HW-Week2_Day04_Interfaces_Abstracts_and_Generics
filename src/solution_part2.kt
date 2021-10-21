//Part 1

fun main() {

    val me1 = Person("Rana").addInfo("Student")
    val me2 = Person(12345678).addInfo(21)


}

class Person <T> (info:T){

    fun addInfo (info:T){
        val myInfo = mutableListOf<T>()
        myInfo.add(info)
        println(myInfo)
    }

}
