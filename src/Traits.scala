import scala.collection.mutable.ArrayBuffer

/**
  * 特质
  * Created by dragon on 31/10/2019.
  */
object Traits {
  def main(args: Array[String]): Unit = {
    val iterator = new IntIterator(10)
    println(iterator.next())
    println(iterator.next())

    // 特质的子类型替换
    val dog = new Dog("Harry")
    val cat = new Cat("Sally")

    val animals = ArrayBuffer.empty[Pet]
    animals.append(dog)
    animals.append(cat)
    animals.foreach(pet => println(pet.name))
  }
}

trait HairColor

trait Iterator[A] {
  def hasNext: Boolean
  def next(): A
}

class IntIterator(to: Int) extends Iterator[Int] {
  // 使用extends关键字 扩展特征, override关键字来实现trait里的抽象成员
  private var current = 0
  override def hasNext: Boolean = current < to
  override def next(): Int = {
    if (hasNext) {
      val t = current
      current += 1
      t
    } else 0
  }
}

trait Pet {
  val name: String
}


class Cat(val name: String) extends Pet
class Dog(val name: String) extends Pet