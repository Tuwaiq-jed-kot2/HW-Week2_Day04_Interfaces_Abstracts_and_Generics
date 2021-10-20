class G<T>(gun1:T,numOfbullet:T){
    fun <T> G(gun1: T,numOfbullet: T){
        println("$gun1 has $numOfbullet")
    }
    init {
        println("$gun1 has $numOfbullet")
    }

}

fun main() {
    val Gun = G("M4",30)
    Gun.G("AWM ",5)
    Gun.G("mp5",35)

}