package systems.vostok.algo.bigsort.pure

object SortRandomIntegers extends App {
  /*val size: Int = 45000000
  val array = ArrayBuffer[Int]()

  (0 to size).foreach(it =>
    array += (Math.random() * it).toInt
  )

  array.foreach(println)
*/
  (0 to 45000000).map(it => (Math.random() * it).toInt)
    .sorted
    .foreach(println)
}
