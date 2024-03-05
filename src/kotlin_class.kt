
//task1 kotlin class


//task2 kotlin class constructor
open class Vehicle(var type:String,var color:String){
//task3 kotlin class function()
    open fun engine(vehi:String, eng:String){
        println("The type of engine is $eng of brand $vehi")
    }
}
class Car:Vehicle("bus","blue") {
    var brand = ""
    var model = ""
    var year = 0

//task4 override the function
    override fun engine(vehi:String, eng:String){
        println("The type of brand $vehi")
    }
}

//task5 secondary constructor

open class Log {
    constructor(data: String) {
        // code
        var name=data
        print(name)
    }
    constructor(data: String, numberOfData: Int) {
        // code
    }
}
class AuthLog: Log {
    constructor(data: String): super(data) {
        // code
    }
    constructor(data: String, numberOfData: Int): super(data, numberOfData) {
        // code
    }
}

//task6 setter and getter

//class Company {
//    var name: String = ""
//        get() = field        // getter
//        set(value) {         // setter
//            field = value
//        }
//}

//task7 interface

interface Vehicl{
    fun start()
    fun stop()
}

class Car1 : Vehicl {
    override fun start()
    {
        println("Car started")
    }

    override fun stop()
    {
        println("Car stopped")
    }
}

fun main()
{
    val obj = Car1()
    obj.start()
    obj.stop()
}
//fun main(args:Array<String>) {


//    print("hello \n colin \t , Welcome to surya")
//    var comp1=Company()
//    comp1.name="Surya-digital"
//    println(comp1.name)
//    var authlog=AuthLog("colin")


//    var vehi1=Car()
//    vehi1.brand="bmw"
//    vehi1.engine(vehi1.brand,"petrol")

//    val c1 = Car()
//    c1.brand = "Ford"
//    c1.model = "Mustang"
//    c1.year = 1969
//
//    val c2=Car()
//
//    val vehi1=Vehicle("bus","red")
//    c2.brand="xuv700"
//
//    println(vehi1.type)
//    println(c2.brand)
//    println(c1.brand)
//    println(c1.model)
//    println(c1.year)
//}
