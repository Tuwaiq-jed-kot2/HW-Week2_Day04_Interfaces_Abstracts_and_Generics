interface Coffee  {
    fun info():String
    fun kindOfCoffee():String
    fun shops():String

}


class Dunkin(val storName:String ,val year:Int):Coffee{
    override fun info(): String {
        return "$storName is a Coffee shops since $year"
    }

    override fun kindOfCoffee(): String {
        return " the coffee is made from high-quality 100% Arabica beans"
    }
    override fun shops(): String {
        return "they have more than 11,300 Dunkin' restaurants worldwide. "
    }

}
class Starbucks(val storName:String ,val year:Int):Coffee{

    override fun info(): String {
        return ("$storName is a Coffee shops since $year")
    }

    override fun kindOfCoffee(): String {
        return " the coffee is made from high-quality 100% Arabica beans."
    }
    override fun shops(): String {
        return "$storName is the largest coffeehouse company in the world with 32,660 stores across the globe."
    }
}

class Illy(val storName:String ,val year:Int):Coffee{
    override fun info(): String {
        return ("$storName is a Coffee shops since $year")
    }

    override fun kindOfCoffee(): String {
        return " the coffee is made from Robusta coffee beans."
    }

    override fun shops(): String {
        return "There are over 160 illy coffee in 34 countries"
    }

}
fun main(){
    val d=Dunkin("Dunkin",1950 )
    println(d.info())
    println(d.kindOfCoffee())
    println(d.shops())

    val s=Starbucks("Starbucks",1971)
    println(s.info())
    println(s.kindOfCoffee())
    println(s.shops())

    val i=Illy("Illy",1933)
    println(i.info())
    println(i.kindOfCoffee())
    println(i.shops())
}