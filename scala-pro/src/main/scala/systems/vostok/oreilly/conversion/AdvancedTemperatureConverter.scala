package systems.vostok.oreilly.conversion

import systems.vostok.utils.PipeOps._

import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn

object AdvancedTemperatureConverter extends App {


  def collectValues(): ArrayBuffer[Double] = {
    val valuesList = new ArrayBuffer[Double]()

    print("Enter target values: \n")

    var flag = true

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

    print(s"Get rid of duplicated values: $duplicatedList")

    values.distinct
  }


  collectValues()
    .pipe(getRidOfDuplicates)
    .pipe(print)


}
