package systems.vostok.oreilly.conversion

import systems.vostok.utils.PipeOps._

import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn

object AdvancedTemperatureConverter extends App {

  collectValues()
    .map { it => BigDecimal(it).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble }
    .pipe(getRidOfDuplicates)
    .sorted
    .map { it => it -> (it * 9.0 / 5 + 32) }
    .pipe(printResult)


  def collectValues(): ArrayBuffer[Double] = {
    val valuesList = new ArrayBuffer[Double]()
    var flag = true

    print("Enter target values: \n")

    while (flag) {
      val value = StdIn.readLine()
      if (value.trim.isEmpty) {
        flag = false
      } else {
        valuesList += value.toDouble
      }
    }
    valuesList
  }

  def getRidOfDuplicates(values: ArrayBuffer[Double]): ArrayBuffer[Double] = {
    val duplicatedList = values.groupBy(identity)
      .collect { case (x, ArrayBuffer(_, _, _*)) => x }

    println(s"Get rid of duplicated values: $duplicatedList")

    values.distinct
  }

  def sortValues(values: ArrayBuffer[Double]): ArrayBuffer[Double] = {
    values.sorted
  }

  def printResult(values: ArrayBuffer[(Double, Double)]): Unit = {
    println("Results:")
    values.foreach { it => println(s"${it._1} -> ${it._2}") }
  }
}
