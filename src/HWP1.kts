interface Animles {  // عملت انتر فيس فيه الصفات المشتركة للحيونات السمكة والحصان وسويت كلاس لكل حيوان وسويت اوفر رايد لكل قدرة على حسب استخدام كل حيوان لها
    fun info()
    fun proprtis ()
}
class Fish (val AnimlesName:String,val AnimlesSound: String) :Animles{
    override fun info() {
        println("$AnimlesName and the sound $AnimlesSound")

    }

    override fun proprtis(){
        println("predation and hunting")
    }
}
class Mouse (val AnimlesName: String, val AnimlesSound: String) :Animles {
    override fun info() {
        println("$AnimlesName and the sound $AnimlesSound")
    }

    override fun proprtis() {
        println("loyalty and intelligence")
    }
}
fun main(){
    var fish = Fish("lolo","meeow")
    println(fish.info())

    var mouse = Mouse("lusifer","hohoho")
    println(mouse.info())
}