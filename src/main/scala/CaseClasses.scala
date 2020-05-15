package main.scala

/**
  * Created by dragon on 2019/11/2.
  */
object CaseClasses {

  def main(args: Array[String]) {
    case class Book(isbn: String)

    // 注意在实例化案例类Book时，并没有使用关键字new，这是因为案例类有一个默认的apply方法来负责对象的创建。
    val frankenstein = Book("978-0486282114")

    case class Message(sender: String, recipient: String, body: String)

    val message1 = Message("guillaume@quebec.ca", "jorge@catalonia.es", "Ça va ?")
    println(message1.sender)
//    message1.sender = "travis@washington.us" // this line does not compile, sender是val不可变量

    // Compare
    val message2 = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
    val message3 = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
    val messagesAreTheSame = message2 == message3  // true
    println(messagesAreTheSame)

    // Copy, 浅拷贝
    val message4 = Message("julien@bretagne.fr", "travis@washington.us", "Me zo o komz gant ma amezeg")
    val message5 = message4.copy(sender = message4.recipient, recipient = "claire@bourgogne.fr")
    println(message5.sender)  // travis@washington.us
    println(message5.recipient) // claire@bourgogne.fr
    println(message5.body)  // "Me zo o komz gant ma amezeg"
  }
}
