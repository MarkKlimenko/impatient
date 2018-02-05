package systems.vostok.generator

import java.io.{BufferedWriter, File, FileWriter}

import scala.collection.mutable.ArrayBuffer

class NumberGenerator {
  def generate(filePath: String): Unit = {
    val file = new File(s"$filePath")
    file.createNewFile()

    val bw = new BufferedWriter(new FileWriter(file))
    bw write generateSequence
    bw.close()
  }

  def generateSequence: String = {
    val r = new scala.util.Random(1000000)
    val sequence = new ArrayBuffer[Int]()

    for (i <- 1 to 50000) {
      sequence += r.nextInt(10000)
    }

    sequence.mkString(" ")
  }
}

