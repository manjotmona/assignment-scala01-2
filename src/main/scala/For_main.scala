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

    print("String Interpolation:\n")
    obj.stringInterpolation(list)
    print("Maximum number in list is:\n")

    print(obj.maximum(list) + "\n")
    print("Nth Fibonacci number:\n")

    print(obj.fabonacci(five) + "\n")
    print("Sum of Digits of Factorial:\n")


    val factorial = obj.factorial(five)
    print(obj.sumOfDigits(factorial))

}
