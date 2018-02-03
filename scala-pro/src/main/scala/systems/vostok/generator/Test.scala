package systems.vostok.generator

object Test {
  def main(args: Array[String]): Unit = {
    new NumberGenerator().generate("dump/generated.txt")
  }
}
