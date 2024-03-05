//fun main(){
//    print("Hello Colin ")
//    println("This is printing in same line ")
//    print("Now cursor is in next line ")
//}


const val Pi=3.14
fun main(args:Array<String>){
        var number1=args[0]
        var number2=args[1]
//   1. variables can be specified as 2 types var and val

//    var number1=args[0].toInt()
//    var number2=args[1].toInt()

//    2.    val number1=50   /* value is like final*/
//        val number2=args[1].toInt()

//   `3. runtime variable specification

//        var number1:Int=args[0].toInt()
//    var number2:String=args[1]

//    4. Function call from main()

//        var totalSum=sum(args[0].toInt(),args[1].toInt())
//    print(totalSum)       Note for return value , return type must be specified in the function which we are calling


//        5. Primary Constructor

//        val add = Add(5, 6)
//        println("The Sum of numbers 5 and 6 is: ${add.c}")

//        6. Init block
//    It acts as an initialiser block where member variables are initialised. This block gets executed whenever an instance of this class
//    is created. There can be multiple init blocks and they are called in the order they are written inside the class.

//      7. Comments 2 types a)single line b)multiline

//      8. String templates
//        var a = 1
//        val s1 = "a is $a"
//
//        a = 2
//        val s2 = "${s1.replace("is", "was")}, but now is $a"
//        print(s2)

//        9. Conditional expression
//            if (number1>number2){
//                print("First argument $number1 is greater than $number2")
//            }
//            else if(number1==number2){
//                print("Both numbers are equal")
//            }
//            else
//                print("Second args $number2 is greater than $number1")

//        10. switch or when function
//
//        var value=describe("Hello")
//          println(value)

//            11. loops
//        for(i in 1..2){
//            print(i)
//        }



}
fun describe(obj: Any): String =
    when (obj) {
        1          -> "One"
        "Hello"    -> "Greeting"
        is Long    -> "Long"
        !is String -> "Not a string"
        else       -> "Unknown"
    }

//fun sum(a:Int,b:Int):Int{
//    print("${a},$b")
//    return a+b
//}

class Add constructor(a: Int,b:Int)
{
//    Note print cannot be done outside the method
    var c=a+b
    init{
        println("This is first init block")
    }

}

