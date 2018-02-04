package systems.vostok.generator

object Test extends App {
  new NumberGenerator()
    .generate("dump/generated.txt")
}
