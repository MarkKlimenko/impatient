package systems.vostok.cs200.procedures

object Solving extends App {


  //print(simpleProcedure(1,3))

  closureProcedure(printer)

  def simpleProcedure(a: Integer, b: Integer): String = {
    (a + b).toString
  }

  def printer(result: String){ print(s"Computation result $result") }

  def closureProcedure(f:(String) => Unit): Unit = {
      f("SOMETHING")
  }
}
