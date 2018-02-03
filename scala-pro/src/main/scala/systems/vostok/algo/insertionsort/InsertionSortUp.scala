package systems.vostok.algo.insertionsort

import scala.collection.mutable.ArrayBuffer

object InsertionSortUp {
  def main(args: Array[String]): Unit = {
    var data = ArrayBuffer(24, 85, 49, 18, 0, 37, 24, 85, 49, 18, 0, 37, 24, 85, 49, 18, 0, 37)

    val timeS = System.currentTimeMillis()
    println(data.sorted.toString)
    println(sort(data))
    println(System.currentTimeMillis()-timeS)
  }

  def sort(data: ArrayBuffer[Int]): ArrayBuffer[Int] = {
    var j = 0

    for ( j <- 1 to data.size - 1) {
      var i = j-1
      var key = data(j)

      while(i>=0 && key<data(i)) {
        var dump = data(i)

        data(i) = key
        data(i+1) = dump

        i = i - 1
      }
    }
    data
  }
}
