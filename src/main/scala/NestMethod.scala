package main.scala

/**
  * Created by dragon on 2019/11/2.
  */
object NestMethod {

  def main(args: Array[String]) {
    println("Factorial of 2: " + factorial(2))
    println("Factorial of 3: " + factorial(3))
  }

  // 阶乘
  def factorial(x: Int): Int = {
    def fact(x: Int, accumulator: Int): Int = {
      if (x <= 1) accumulator
      else fact(x - 1, x * accumulator)
    }
    fact(x, 1)
  }

}
