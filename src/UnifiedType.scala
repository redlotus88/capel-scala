/**
  * 统一类型
  * Created by dragon on 31/10/2019.
  */
object UnifiedType {

  def main(args: Array[String]): Unit = {
    // Any是所有类型的超类, AnyRef == java.lang.Object, AnyVal代表所有值类型

    val list: List[Any] = List(
      "a string",  // String
      732, // an integer
      'c', // a character
      true, // a boolean value
      () => "an anonymous function returning a string"
    )

    list.foreach(element => println(element))

    // 类型转换
    val x: Long = 987654321
    val y: Float = x
    println(y)

    val face: Char = '☺'
    val number: Int = face
    println(number)

    // Nothing和Null, Nothing是所有类型的子类, Null是所有引用类型的子类,无实际用途.

  }

}
