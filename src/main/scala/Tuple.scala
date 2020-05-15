package main.scala

/**
  * tuple
  * Created by dragon on 31/10/2019.
  */
object Tuple {
  def main(args: Array[String]): Unit = {
    // 创建一个包含一个String元素,一个int元素的元组
    val ingredient = ("Sugar", 25):Tuple2[String, Int]

    // 访问元素
    println(ingredient._1)
    println(ingredient._2)

    // 解构元组数据
    val (name, quantity) = ingredient
    println(name)
    println(quantity)

    // 元组解构也可用于模式匹配
    val planetDistanceFromSun = List(("Mercury", 57.9), ("Venus", 108.2), ("Earth", 149.6 ), ("Mars", 227.9), ("Jupiter", 778.3))
    planetDistanceFromSun.foreach(tuple => {
      tuple match {
        case ("Mercury", distance) => println(s"Mercury is $distance millions km far from sun")
        case p if (p._1 == "Venus") => println(s"Venus is ${p._2} millions km far from sun")
        case p if (p._1 == "Earth") => println(s"Blue plant is ${p._2} millions km far from sun")
        case _ => println("Too Far....")
      }
    })

    // for 表达式中解构元组
    val numPairs = List((2, 5), (3, -7), (20, 56))
    for((a, b) <- numPairs) {
      println(a * b)
    }
  }
}
