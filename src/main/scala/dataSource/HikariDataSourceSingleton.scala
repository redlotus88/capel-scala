package dataSource

import com.zaxxer.hikari.{HikariConfig, HikariDataSource}

object HikariDataSourceSingleton {
  @transient private var instance: HikariDataSource = _

  def getDataSourceInstance : HikariDataSource = {
    if (instance == null) {
      try {
        val config = new HikariConfig
        config.setJdbcUrl("jdbc:mysql://localhost:3306/capel-scala")
        config.setUsername("root")
        config.setPassword("root")
        config.addDataSourceProperty("cachePrepStmts", "true")
        config.addDataSourceProperty("prepStmtCacheSize", "250")
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048")
        instance = new HikariDataSource(config)
      } catch {
        case ex: Exception => ex.printStackTrace()
      }
    }
    instance
  }
}
