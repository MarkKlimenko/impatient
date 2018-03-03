package systems.vostok.cs200.procedures

object Euclid extends App {

  print(euclid(150, 200))

  def euclid(i: Int, j: Int): Int = {
    if (i % j == 0) {
      j
    } else {
      euclid(j, i % j)
    }
  }
}
