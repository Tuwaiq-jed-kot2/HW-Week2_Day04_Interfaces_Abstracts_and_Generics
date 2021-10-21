// كود لحساب الخصم
interface Shopping{

    fun cal():Double
    fun printText()
}
class Discount():Shopping{
    val price=1000
    val dis = 50 //mean 50%

    override fun cal():Double {

        return ((price*dis)/100.0)
    }

    override fun printText() {
        println("Thank you")
    }


}

/*fun main() {
    val x =Discount()
    println(x.cal())
    x.printText()
}


 */


////////////abstract////////////////////////////
//كود يحسب صافي الراتب
abstract class Company(val id: Int, var basicSalary: Double) {
    fun getInfo() {
        println("$id and $basicSalary")
    }

    abstract fun calcluate(): Double

}

class Employee : Company(345678, 3000.0) {
    override fun calcluate(): Double {
        val HRA = 0.1 * basicSalary//بدل سكن
        val DA = 0.73 * basicSalary//بدل اعانه
        val GS = basicSalary - DA - HRA//الراتب الاجمالي
        val incometax = 0.3 * GS//ضريبة الدخل
        val netSalary = GS - incometax//صافي الراتب
        return netSalary
    }

}

fun main() {
    val x = Employee()
    x.getInfo()
    println(x.calcluate())

}
