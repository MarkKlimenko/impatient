package systems.vostok.cs200.datastructures

import scala.collection.mutable.ArrayBuffer

object PascalTriangle extends App {
  printTriangle(composeTriangle(5)) // 1 to ..

  def composeTriangle(rowNum: Int): ArrayBuffer[ArrayBuffer[Int]] = {
    var triangle = ArrayBuffer[ArrayBuffer[Int]](ArrayBuffer[Int](1))

    if (rowNum > 1) {
      (0 until rowNum - 1).foreach { index =>
        triangle += expandRow(triangle(index))
      }
    }

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

  def printTriangle(triangle: ArrayBuffer[ArrayBuffer[Int]]): Unit = {
    val triangleLength = triangle.length

    triangle.zipWithIndex.foreach { case (row, index) => printSingleRow(row, triangleLength - index - 1) }
  }

  def printSingleRow(singleRow: ArrayBuffer[Int], spaceNum: Int): Unit = {
    print(" " * spaceNum)
    singleRow.foreach { value => print(s"$value "); value }
    println
  }
}
