package main.scala.mysql

import java.sql.{Connection, DriverManager}

object MySQLConnection {
  var conn: Connection = null

  def main(args: Array[String]): Unit = {
    try {
      Class.forName("com.mysql.jdbc.driver")
      println("加载驱动成功")
      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/capel-scala?user=root&password=root&useSSL=false")
      println("数据库连接成功")
      val statement = conn.createStatement()
      val resultSet = statement.executeQuery("select * from test limit 2")
      while (resultSet.next()) {
        println(resultSet.getString(2))
      }
    } catch {
      case _: Exception => 0
    } finally {
      if (conn != null) {
        conn.close()
      }
    }
  }
}
