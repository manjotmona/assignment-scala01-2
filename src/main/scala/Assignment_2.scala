/**
 * Created by manjot on 9/1/18.
 */
class Assignment_2 {
  def stringInterpolation(list: List[Int]): Unit = {
    for (x <- 0 to list.length - 1) {
      print(s"$x = ${ list(x) } \n")
    }
  }

  def maximum(list: List[Int]): Int = {
    var max: Int = list(0)
    for (x <- 1 to list.length - 1) {
      if (list(x) > max) {
        max = list(x)
      }
    }
    max
  }

  def fabonacci(num: Int): Int = {
    if (num == 0) {
      0
    }
   else if (num == 1) {
      1
    }

    else {
       (fabonacci(num - 1) + fabonacci(num - 2))
    }

  }

  def factorial(num: Int): Int = {
    if (num == 1) {
      1
    }
    else {
      (factorial(num - 1) * num)
    }

  }

  def sumOfDigits(num: Int): Int = {
    if (num != 0) {
       (num % 10 + sumOfDigits(num / 10))
    }

    else {

      0
    }
  }

}

