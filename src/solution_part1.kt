
//--------------------------part1--------------------------
interface pet{

    val petName:String
    val petAge:Int

    fun petEat()
    fun petPlay()
    fun petSpeak()
}

class Parrot:pet{

    override val petName: String
        get() = "parrot"

    override val petAge: Int
        get() = 1

    override fun petEat() {
        println("yumiiiiiiiiiiiiii")
    }

    override fun petPlay() {
        println("wooooooooooooooow paly")
    }

    override fun petSpeak() {
        println("hi")
    }

}


//-----------------------------part2-------------------------------

abstract class Pet2{

    abstract val petName:String
    abstract val petAge:Int

    fun petEat(){

    }
    fun petPlay(){

    }
    abstract fun petSpeak()
}

class parrot:Pet2(){

    override val petName: String
        get() = "parrot"

    override val petAge: Int
        get() = 1

    override fun petSpeak() {
        println("hi")
    }

}