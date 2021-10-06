

interface  Iphone {
    fun Model() {
        print("your Model : ")
    }


    class Mobile(val Model: Int) : Iphone {


        override fun Model() {
            super.Model()
            println(Model)
        }

    }

    fun main() {
        val Mobile1 = Mobile(2021)
        Mobile1.Model()
    }
}
//Interface Question

abstract class Iphone {
    abstract fun Model() {
        class Mobile(val Model: Int) : Iphone

        override fun Model() {

            println(Model) {




        }

        fun main() {
            var Mobile2 = Mobile(2022)
            Mobile2.Model()
        }
    }




