abstract class Students (val studentName:String,val studentClass:Int){

    fun schoolInfo(){

        println("$studentName is student at $studentClass.")
    }

    abstract fun ID():Int
}

class student1 (val ID:Int):Students("Eshraq",1) {
    override fun ID(): Int {
        return (ID)
    }
}

class student2 (val ID:Int):Students("Shuruq",2) {
    override fun ID(): Int {
        return (ID)
    }
}

fun main() {
    val s1 = student1(101010)
    s1.schoolInfo()
    println(s1.ID)
    val s2 = student2(121212)
    s2.schoolInfo()
    println(s2.ID)
}
