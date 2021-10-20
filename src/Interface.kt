interface WesternCities { //implementation of comparison between jeddah and (your city ;) )

    fun area():Int

    fun info()

}

class City1 (val cityName:String,val weather:String) : WesternCities {
    val a = 12000

    override fun area(): Int {

        return (a)
    }

    override fun info() {
        println("the city name is:$cityName \nand the weather $weather out there.")

    }
}
class City2 (val cityName:String,val weather: String) : WesternCities {
    val a1 = 800
    override fun area(): Int {

        return (a1)

    }

    override fun info() {
        println("the city name is:$cityName \nand the weather $weather out there.")
    }


}

fun main() {
    val j = City1("Jeddah","almost HOT!")
    val t = City2("Taif","cold!!!")
    println(j.area())
    j.info()
    println(t.area())
    t.info()

}
