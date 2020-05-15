package main.scala

/**
  * Created by dragon on 2019/11/2.
  */
object Mixin {

  def main(args: Array[String]): Unit = {
    // 类D有一个父类B和一个混入C。一个类只能有一个父类但是可以有多个混入（分别使用关键字extend和with）。混入和某个父类可能有相同的父类。
    val d = new D
    println(d.message)
    println(d.loudMessage)

    class RichStringIter extends StringIterator("Scala") with RichIterator

    val richStringIter = new RichStringIter
    richStringIter foreach println
  }
}

abstract class A {
  val message: String
}

class B extends A {
  val message = "I'm an instance of class B"
}

trait C extends A {
  def loudMessage = message.toUpperCase()
}

class D extends B with C

abstract class AbsIterator {
  type T
  def hasNext: Boolean
  def next(): T
}

class StringIterator(s: String) extends AbsIterator {
  type T = Char
  private var i = 0
  def hasNext = i < s.length
  def next() = {
    val ch = s charAt i
    i += 1
    ch
  }
}

trait RichIterator extends AbsIterator {
  def foreach(f: T => Unit): Unit = while (hasNext) f(next())
}
