package systems.vostok.interview.string.singlecharacter

import systems.vostok.utils.PipeOps._

object Test extends App {
  val testString = "Some test string"

  testString
      .pipe(new UniqueCharFinder().findUnique)
      .foreach(println)
}
