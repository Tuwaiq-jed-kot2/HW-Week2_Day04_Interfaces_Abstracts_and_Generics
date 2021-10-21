



interface  Iphone {
    fun Model() {
        print("your Model : ")

    }
}
        class Mobile(val Model: Int) : Iphone {
            override fun Model() {
                super.Model()
                println(Model)
            }
        }
    //Interface Question
    abstract class Iphone1 {
        abstract fun Model()

    }

    class Mobile1(val Model: Int) : Iphone {

        override fun Model() {
            println(Model)
        }
    }

    fun main() {
        var Mobile2 = Mobile(2022)
        Mobile2.Model()
    }







