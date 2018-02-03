package systems.vostok.algo.insertionsort

import java.io.File

import scala.collection.mutable.ArrayBuffer
import scala.io.Source

object InsertionSortUp {
  def main(args: Array[String]): Unit = {
    var data: ArrayBuffer[Int] = getSequence

    val timeS = System.currentTimeMillis()
    println(data.sorted.toString)
    println(sort(data))
    println(System.currentTimeMillis()-timeS) //8731
  }

  def getSequence: ArrayBuffer[Int] ={
    var dataList = new ArrayBuffer[Int]()
    for (e <- Source.fromFile("dump/generated.txt").getLines().mkString.split(" ")) {
      dataList += e.toInt
    }

    dataList
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
