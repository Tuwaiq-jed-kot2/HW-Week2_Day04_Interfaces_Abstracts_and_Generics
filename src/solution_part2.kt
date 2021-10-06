//------------------------------------part1--------------------------

class LooTBox <T> (val item:T) {

    init {
        println(item)
    }

}

fun main(){
    val x = LooTBox(3)
    val y = LooTBox("Eman")
    val d = LooTBox(3.3)
}

//------------------------------part2------------------------------------

/*
Kotlin provides a complementary variance annotation:

The out modifier is called a variance annotation, and since it is provided at the type parameter
declaration site, it provides declaration-site variance. This is in contrast with Java's use-site
variance where wildcards in the type usages make the types covariant.

in It makes a type parameter contravariant,
meaning it can only be consumed and never produced.


 */