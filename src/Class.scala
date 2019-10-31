/**
  * 类
  * Created by dragon on 31/10/2019.
  */
object Class {
  def main(args: Array[String]): Unit = {
    val user1 = new User
    val point1 = new Point(2, 3)
    println(point1.x) // var定义的变量可以直接访问
    println(point1)

    val point2 = new Point(y = 2) // x为默认值0, 默认值需要显示指定
    println(point2.x, point2.y)

    val pointAcc = new PointAccessor
    pointAcc.x = 1
    pointAcc.y = 2
    println(pointAcc)

  }
}

class User

class Point(var x: Int = 0, var y: Int = 0) {
  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
  }

  override def toString: String = {
    s"($x, $y)"
  }
}

// Getter和Setter
class PointAccessor {
  private var _x = 0
  private var _y = 0
  private val bound = 100
  def x = _x
  def x_= (newValue: Int): Unit = {
    if (newValue < bound) _x = newValue else printWarning
  }

  def y = _y
  def y_= (newValue: Int): Unit = {
    if (newValue < bound) _y = newValue else printWarning
  }

  private def printWarning = println("Warning: Out of bounds")
}