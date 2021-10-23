

class AA<T>(item: T) {


    init {
        println(item)

    }


    var Box = mutableListOf<T>()
    fun <Y> additem(newItem: T) {
        Box.add(newItem)
    }
}

fun main() {

    val x = AA(item = 6.6f)


}

/////// Generic Question part1

/////the Kotlin List<out T> type is an interface that provides read only operations like size,
//get and so on. Like in Java, it inherits from Collection<T> and
//that in turn inherits from Iterable<T> .
//Methods that change the list are added by the MutableList<T> interface.


/////// Generic Question part2


