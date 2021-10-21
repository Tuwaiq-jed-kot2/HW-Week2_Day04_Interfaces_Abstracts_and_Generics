// حل البونس بالاسفل=)

abstract class Edu (name: String) {

    var age: Int = 30

    fun display() {
        println("")
    }

    abstract fun displayJob(description: String)
}

class Teacher(name: String): Edu (name) {

    override fun displayJob(description: String) {
        println(description)
    }
}

fun main() {
    val t = Teacher("Anas")
    println(t.displayJob(" kotlin teacher."))
}

// حل البونس
//------Generic Types------
//A generic type is a generic class or interface that is parameterized over types.
//------Generic by using the (out) keyword as follows:----------
//fun main(args: Array<String>) {
//	val x: MyClass<Any> = MyClass<Int>()	 // Error: Type mismatch
//	val y: MyClass<out Any> = MyClass<String>() // Works since String is a subtype of Any
//	val z: MyClass<out String> = MyClass<Any>() // Error since Any is a supertype of String
//}
//class MyClass<T>
//---Generic by using the (in) keyword as follows-------
//fun main(args: Array<String>) {
//		var a: Container<Dog> = Container<Animal>() //compiles without error
//		var b: Container<Animal> = Container<Dog>() //gives compilation error
//}
//open class Animal
//class Dog : Animal()
//class Container<in T>
// ---------Generic by using the (where) keyword  (تعريف فقط) -------
//The where clause in a generic definition specifies constraints on the types that are used as arguments
// for type parameters in a generic type, method, delegate, or local function. Constraints can specify interfaces, base classes,
// or require a generic type to be a reference, value, or unmanaged type. They declare capabilities that the type argument must have.
//For example, you can declare a generic class, AGenericClass, such that the type parameter T implements the IComparable<T> interface:

