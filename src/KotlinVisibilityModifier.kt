//Task1 private access modifier
private class A{
    private val int = 10
    fun display()
    {
        println(int)
        println("Accessing int successful")
    }
}

//task2 Public access modifier
private class B{
    public val int = 10
    fun display()
    {
        println(int)
        println("Accessing int successful")
    }
}

//task3 Protected access modifier
open class C{
    protected val number=10
    fun display(){
        println("The number chosen is $number")
    }
}

class derived:C(){
    fun derivedisplay():Int{
        super.display()
        return number
    }
}

//task4 internal visibility

internal class Inter {
}
public class Inter2 {
    internal val int = 10
    internal fun display() {
    }
}



fun main(args: Array<String>){
    var a = derived()
    var b=C()
//    print(b.number)      cannot access as the number is accessible only in derived class
    var value=a.derivedisplay()
   println(value)  //cannot access the int from the class A
}