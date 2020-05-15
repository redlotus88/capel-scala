package dataSource

object HikariDataSourceTest {

  def main(args: Array[String]): Unit = {

    val dsPool = HikariDataSourceSingleton.getDataSourceInstance
    val connection = dsPool.getConnection

    val result = connection.createStatement().executeQuery("select * from test limit 2")
    while (result.next()) {
      val obj = result.getString(2)
      println(obj)
    }

  }
}
