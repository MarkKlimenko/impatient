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
      case it if checkA(it) => print("A checked")
      case it if checkB(it) => print("B checked")
    }
  }
}
