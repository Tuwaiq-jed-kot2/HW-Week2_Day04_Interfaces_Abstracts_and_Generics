/*---------------------------------Part I-------------------------------------*/
/*Answer Q1:------------------------------------------------------------------*/
//fun main() {
//    var rode = Path("King Abdulaziz Road",80.0,5.00)
//    println(rode.street)
//    println(rode.distance())
//
//}
//interface TrackInfo{
//    fun street():String
//    fun distance():Double
//}
//
//class Path(var street:String,var speed:Double,var time:Double):TrackInfo {
//    override fun street(): String {
//        return street
//    }
//
//    override fun distance(): Double {
//        return speed * time
//    }
//}

/*Answer Q2:------------------------------------------------------------------*/
import java.util.*

abstract class YearOfBirth(val name: String, val age: Int) {
    fun aName() {}
    open fun theDate() {}
}

class CalculationYears() : YearOfBirth("Mohammed", 20) {
    fun aNme() {
        println(name)
    }

    override fun theDate() {
        val date = Calendar.getInstance().get(Calendar.YEAR) - age
        println(date)
    }
}

fun main() {
    val a = CalculationYears()
    a.aNme()
    a.theDate()
}