name := "capel-scala"
version := "0.1"
scalaVersion := "2.13.2"

libraryDependencies ++= Seq(
  "com.zaxxer" % "HikariCP" % "3.2.0",
  "mysql" % "mysql-connector-java" % "5.1.6"
)
