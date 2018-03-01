package systems.vostok.cs200.procedures

object HigherOrder extends App {
  printCustom(simplePrinter, "SOMETHING")
  printCustom(complexPrinter, "SOMETHING")

  def simpleProcedure(a: Integer, b: Integer): String = {
    (a + b).toString
  }

  def simplePrinter(data: String) {
    println(s"Simple result $data")
  }

  def complexPrinter(data: String) {
    println(s"Complex result $data")
  }

  def printCustom(f: (String) => Unit, data: String): Unit = {
    f(data)
  }
}
