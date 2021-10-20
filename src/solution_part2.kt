
//Part 1

class Game <T> (item: T) {

init {
    println(item)
}

    fun <Y> addItems(item: Y) {
        val lootBox = mutableListOf<Y>()
        lootBox.add(item)
        println(lootBox)
    }
}


fun main() {
    val player = Game(4)
    val player2 = Game("Fire weapon")

    println()

    player.addItems("Purple skin")
    player.addItems(55)
    player.addItems(3.3)
    player.addItems(10.70f)
}


//Part 2 (Extra)

//out modifier is called covariant, a covariant is a producer of T which means functions can return T, but they can't take T as arguments.
class A <out T> {
    private val numbers = mutableListOf<T>()
    fun produce(): T = numbers.last()
}

//in modifier is called contravariant, and it's the opposite of out, a contravariant is a consumer of T which means functions can take T as arguments, but they can't return T.
class B <in T> {
    private val numbers = mutableListOf<T>()
    fun consume(item: T) = numbers.add(item)
}