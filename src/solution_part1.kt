//----------------------------------this part for Interfaces----------------------------------
interface SpeakUp {
    fun copminName( firstName :String, lastName:String):String

    fun dgree (dgree:String):String

    fun university (universityName: String,universityCity:String):String

}



class MakeMySpeak():SpeakUp {
    override fun copminName(firstName: String, lastName: String): String {
        return " hi,My name is ${firstName.toUpperCase()} ${lastName.toUpperCase()}\n"
    }

    override fun dgree(dgree: String): String {
        return " I have a dgree in $dgree \n"
    }

    override fun university(universityName: String,universityCity:String): String {
        return "I studied in ${universityName.capitalize()} university in ${universityCity.capitalize()} "
    }


}
//----------------------------------this part for abstract class----------------------------------
abstract class DayAndYear(var year:Int,var day:String){

    abstract fun trueOrFalse(x :Boolean):Boolean
    fun dateInfo(){
        if (year>2021 || year<2021){
            for ( x in 1..10) {
                print("wrong year")
                println("ERROR")
            }
        }else {
            println("year: $year\ntoady is $day")
        }
    }
}
class ThisClassJustForUseAbstractClass :DayAndYear(2020,"sunday") {
    fun thisFunctionJustForPrint(){
        // println("-------for abstract fun-------")
        println( println("year: $year\ntoady is $day"))
    }
    override fun trueOrFalse(x: Boolean): Boolean {
        return true
    }


}

//
fun main() {
    println("--------------this part for Interfaces--------------")

    val s=MakeMySpeak()
    println(s.copminName("faisal","alhejaili"))
    println(s.dgree("Management Information System"))
    println(s.university("taibah","madinah"))
    println("--------------this part for AbstractClass--------------")
    val w= ThisClassJustForUseAbstractClass()
    w.thisFunctionJustForPrint()
    println("--------------this part for Generics--------------")
    val g=ForGenerics(10)
    val m=ForGenerics("toady is")


}

//