package systems.vostok.patterns

object GuardsSample extends App {
  val ch = "b"

  exec(ch)

  def checkA(ch: String): Boolean = {
    ch == "a"
  }

  def checkB(ch: String): Boolean = {
    ch == "b"
  }

  def exec(ch: String): Unit = {
    ch match {
      case _ if checkA(ch) => print("A checked")
      case _ if checkB(ch) => print("B checked")
    }
  }
}
