package systems.vostok.oreilly.conversion

import scala.io.StdIn

object ListTemperatureConverter extends App {
  print("Enter Celsius values separated by spaces then press Enter: ")

  def calculateAndPrint(value: Int): Unit = {
    println(s"Value: $value  Converted value: ${value * 9.0 / 5 + 32}")
  }

  StdIn.readLine()
    .split(" ")
    .map(_.toInt)
    .foreach(calculateAndPrint)
}
