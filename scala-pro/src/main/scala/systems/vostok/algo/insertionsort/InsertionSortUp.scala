package systems.vostok.algo.insertionsort

object InsertionSortUp {

  def main(args: Array[String]): Unit = {
    var data = List(24, 85, 49, 18, 0, 37)

    println(data.sorted)
    println(sort(data))
  }

  def sort(data: List[Int]): List[Int] = {

    var updatedData = data
    var j = 0

    for ( j <- 1 to updatedData.size - 1) {

      var i = j-1
      var key : Int = updatedData(j)

      while(i>=0 && key<updatedData(i)) {

        var dump : Int = updatedData(i)

        updatedData = updatedData.updated(i,key)
        updatedData = updatedData.updated(i+1,dump)

        i = i - 1
      }
    }
    updatedData
  }
}
