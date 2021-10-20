
//part1
//Q1
interface MovieTheater{

    var movieName:String
    var movieGenre:String
    var language:String
    var subtitle:String


    fun movieDetails():String

    fun movieShowTime():String

}
 class Movies( override var movieName:String,override var movieGenre:String,override var language:String,override var subtitle:String) : MovieTheater{

     override fun movieDetails(): String {
         println("Movie Details")
        return " $movieName , $movieGenre , $language , $subtitle "
     }

     override fun movieShowTime():String {

         return "show time for $movieName is 9 p.m "
     }

 }


  //*********************************************************************************//

//part1
//Q2

abstract class MovieTheater1(var movieName: String,var movieGenre: String,var language: String,var subtitle:String){

    fun movieDetails(){
        println("Movie Details")
        println(" $movieName , $movieGenre , $language , $subtitle ")
    }

    abstract fun showTime():String

}

class Movies1():MovieTheater1("Hangover","Comedy","English","Arabic"){
    override fun showTime(): String {
        return "show time for $movieName is 5 p.m "
    }

}

fun main(){

    // part1- Q1
    var m1 = Movies("Don't Breath","Horror","Spanish","Arabic")
    println(m1.movieDetails())
    println(m1.movieShowTime())

    //**********************************//
    // part1 - Q2
      var m2 = Movies1()
    m2.movieDetails()
    println(m2.showTime())
}
