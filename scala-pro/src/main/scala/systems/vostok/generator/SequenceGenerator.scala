package systems.vostok.generator

import scala.collection.mutable.ArrayBuffer

object SequenceGenerator {
  def generateSimpleSequence(length: Int): ArrayBuffer[Int] = {
    (1 to length).to[ArrayBuffer]
  }
}
