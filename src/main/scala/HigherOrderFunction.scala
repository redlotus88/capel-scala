package main.scala

/**
  * Created by dragon on 2019/11/2.
  */
object HigherOrderFunction {
  def main(args: Array[String]): Unit = {
    val salaries = Seq(20000, 70000, 40000)
    val doubleSalary = (x: Int) => x * 2
    val newSalaries = salaries.map(doubleSalary) // 等价于 val newSalaries = salaries.map(_ * 2)

    println(newSalaries)
  }
}

// 强制转换方法为函数
case class WeeklyWeatherForecast(temperatures: Seq[Double]) {
  private def convertCtoF(temp: Double) = temp * 1.8 + 32
  def forecastInFahrenheit: Seq[Double] = temperatures.map(convertCtoF) // Passing the method convertCtoF
}

// 接受函数作为参数的函数
object SalaryRaiser {

  def smallPromotion(salaries: List[Double]): List[Double] = {
    salaries.map(salary => salary * 1.1)
  }
}