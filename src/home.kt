class Surprise<T>(SUP: T) {

    init {
        println("woOoo your surprise is $SUP ")
    }
}

fun main() {
    val surprise1 = Surprise("an international flight")
    val surprise2 = Surprise(1000)
}

