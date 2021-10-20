/*
the code below is contest where the first place gets a reward of 2500 SAR
and the second place get a reward of thank you for participation which
he deserves it because no one likes the second place
 */

class Prize <T> (reward:T){
    init {
        println("congratulations you won and your reward is $reward")
    }
}

fun main() {
    val first = Prize(2500)
    val second = Prize("Thank you for your participation")
}