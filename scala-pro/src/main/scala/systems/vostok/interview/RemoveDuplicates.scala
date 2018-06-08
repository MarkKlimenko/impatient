package systems.vostok.interview

import scala.collection.mutable.ArrayBuffer

object RemoveDuplicates extends App {
  def removeDuplicates(list: List[Int]): List[Int] = {
    val expectedList: ArrayBuffer[Int] = new ArrayBuffer[Int]()

    list.foreach { number: Int =>
      if (!expectedList.contains(number)) {
        expectedList += number
      }
    }
    expectedList.toList
  }

  removeDuplicates(List(1, 5, 6, 4, 8, 7, 8, 1, 2))
    .foreach(println)
}
