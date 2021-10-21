class Grocery<T> (var item: T){


    fun addGroceryItem(newItems: T){

        println(newItems)

    }



}

fun main() {

    val y = Grocery("")

    y.addGroceryItem("Yogurt")


}