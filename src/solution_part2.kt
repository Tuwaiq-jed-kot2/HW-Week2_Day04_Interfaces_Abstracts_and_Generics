
//part2 - Q1
class dataTypes <A> (elements: A) {

    init {
        println(elements)
    }

}

fun main(){

    var data1 = dataTypes(5)
    var data2 = dataTypes("Asrar")
    var data3 = dataTypes(6.5678)
    var data4 = dataTypes(25.5f)
    var data5 = dataTypes("Welcom")
}

//part 2 - Q2

//Create three Generic Classes examples, one with Where, one with Out keyword
// and the third with In keyword

/*the out keyword on the generic type. It means that we can assign
this reference to any of its supertypes. The out value can be only be
 produced by the given class but not consumed*/

/*the in keyword on the generic type if we want to assign it to the reference
of its subtype. The in keyword can be used only on the parameter type
 that is consumed, not produced */

