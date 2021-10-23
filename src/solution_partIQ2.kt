//Q2

abstract class Vehicle(var vehicleName: String, private var vehicleColor: String){

    abstract fun moveForward() : String

    fun vehicleInfo() = println("The $vehicleName color is $vehicleColor")

}

class Car : Vehicle("car","Blue"){

    init {

        vehicleInfo()

    }


    override fun moveForward(): String = "The $vehicleName moving forward"


}


fun main() {


    val vehicle = Car()
    println(vehicle.moveForward())

}

