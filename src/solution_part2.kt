fun main() {
    Genericx("Hello")
    Genericx(5)
    Genericx(5.6)
    Genericx('A')
}

class Genericx<T>(item: T) { //the T is a Data type that accept any data type
    init {
        println(item)
    }
}


