/**
  * Scala基础
  * Created by dragon on 31/10/2019.
  */
object BasicExample {

  def main(args: Array[String]): Unit = {
    // 表达式
    println(1)
    println(1 + 1)
    println("hello!")
    println("hello world")

    // 常量
    val x = 1 + 1
    println(x)

    // 常量的显示声明
    val y: Int = 1 + 1

    // 变量
    var z = 1 + 1
    z = 3
    println(z)

    // 代码块 blocks
    println({
      val x = 1 + 1
      x + 1
    })

    // 函数, 带有参数的表达式
    val addOne = (x: Int) => x + 1 // 匿名函数
    println(addOne(1))

    val add = (x: Int, y: Int) => x + y // 多参数
    println(add(1, 2))

    val getTheAnswer = () => 42 // 无参
    println(getTheAnswer())

    // 方法, 函数类似, def定义,有返回类型
    def addMethod(x: Int, y: Int): Int = x + y
    println(addMethod(x, y))

    // 类
    class Greeter(prefix: String, suffix: String) {
      def greet(name: String): Unit =
        println(prefix + name + suffix)
    }

    val greeter = new Greeter("hello, ", "!")
    greeter.greet("Scala developer")

    // 样例类
    case class Point(x: Int, y: Int)
    val point = Point(1, 2)
    val anotherPoint = Point(1, 2)
    val yetAnotherPoint = Point(2, 2)

    println(point == anotherPoint)
    println(anotherPoint == yetAnotherPoint)

    // 对象
    object IdFactory {
      private var counter = 0
      def create(): Int = {
        counter += 1
        counter
      }
    }

    val newId: Int = IdFactory.create()
    println(newId)

    // 特质, 类似Java接口,可以有默认实现, extends 来继承特质,override覆盖默认实现
    // 特质可以被多继承
    trait GreeterTrait {
      def greet(name: String): Unit
    }

    // 主方面, 类似Java main函数,本例就是一个调用主方法的例子
  }
}
