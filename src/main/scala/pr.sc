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
fabonacci(6)