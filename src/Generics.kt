class Weather <T>(dustChance:T){
    init {
        println(dustChance)
    }

}
fun <E>todayWeather(weather:E){
    println(weather)

}
fun main() {
    val O = Weather(6.8)
    val i = Weather("hopefully not!")
    todayWeather("Dust storm")
}