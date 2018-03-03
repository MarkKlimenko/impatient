package systems.vostok.cs200.datastructures

import scala.collection.mutable.ArrayBuffer

object PascalTriangle extends App {

  val prevRow = ArrayBuffer[Int](1)

  print(composeTriangle(2))


  def composeTriangle(rowNum: Int): ArrayBuffer[ArrayBuffer[Int]] = {
    var triangle = ArrayBuffer[ArrayBuffer[Int]](ArrayBuffer[Int](1))

    (0 to rowNum).foreach(index => triangle += expandRow(triangle(index)))

    triangle
  }

  def expandRow(prevRow: ArrayBuffer[Int]): ArrayBuffer[Int] = {
    var targetRow = ArrayBuffer[Int](1)

    prevRow.indices.foreach { index =>
      if (index != 0) {
        targetRow += (prevRow(index - 1) + prevRow(index))
      }
    }

    targetRow += 1
  }

  def printSingleRow(singleRow: ArrayBuffer[Int]): Unit = {
    singleRow.foreach { value => print(s"$value "); value }
    println
  }
}
