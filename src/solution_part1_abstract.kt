abstract class BookStore(val bookName: String, val bookAuther: String, val isToBuy: Boolean) {


    fun bookInfo(){
        println("the book name is [$bookName] wrote by [$bookAuther]")
    }

    abstract fun bookToBuy(): String
    
}

class ChildBook() : BookStore("diary of wimpy kid", "jiff kiny", true) {
    override fun bookToBuy(): String {
        return if (isToBuy) {
            "you can read and buy this book [$bookName]"
        } else
            "this book [$bookName] for read only, not allowed to buy!"

    }

}

class RefrenceBook() : BookStore("muqadma Ibn Kholdon", "Ibn Kholdon", false) {
    override fun bookToBuy(): String {
        return if (isToBuy) {
            "you can read and buy this book [$bookName]"
        } else {
            "this book [$bookName] for read only, not allowed to buy!"
        }
    }

}

fun main() {
    val b1 = ChildBook()
    b1.bookInfo()
    println(b1.bookToBuy())

    val b2 = RefrenceBook()
    b2.bookInfo()
    println(b2.bookToBuy())
}