
//----------------------------------this part for Generics----------------------------------

class ForGenerics <T>(ForFun:T){
    init {
        println(ForFun)
    }
    fun GenericsFunction(ForFun: T){
        val F= mutableListOf<T>()
        F.add(ForFun)
    }
}
// the main function are in solution_part1 file
//