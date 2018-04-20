package systems.vostok.algo.bigsort.pure

import scala.collection.mutable.ArrayBuffer

object SortRandomIntegers extends App {
  val size: Int = 45000000
  val array = ArrayBuffer[Int]()

  (0 to size).foreach(it =>
    array += (Math.random() * it).toInt
  )

  array.foreach(println)
}
