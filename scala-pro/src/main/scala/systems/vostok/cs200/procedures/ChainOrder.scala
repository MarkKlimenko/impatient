package systems.vostok.cs200.procedures

object ChainOrder extends App {
  printCustom(compute(15, 24))

  def compute(a: Integer, b: Integer): String = {
    (a + b).toString
  }

  def printCustom(data: String): Unit = {
    println(data)
  }
}
