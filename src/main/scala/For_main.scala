/**
 * Created by manjot on 9/1/18.
 */


  object For_main extends App {


    var obj = new Assignment_2()
    val one = 1
    val two = 2
    val three = 3
    val four = 4
    val five = 5
    val six = 6
    val list = List(one,two,three,four,five,six)

    println("String Interpolation:\n")
    obj.stringInterpolation(list)
    println("Maximum number in list is:\n")

    println(obj.maximum(list) + "\n")
    println("Nth Fibonacci number:\n")

    println(obj.fabonacci(5) + "\n")
    println("Sum of Digits of Factorial:\n")


    val factorial = obj.factorial(5)
    println(obj.sumOfDigits(factorial))

}
