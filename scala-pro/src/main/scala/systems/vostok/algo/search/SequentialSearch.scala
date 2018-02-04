package systems.vostok.algo.search

import org.slf4j.LoggerFactory
import systems.vostok.generator.SequenceGenerator
import systems.vostok.performance.TimeChecker

import util.control.Breaks._

object SequentialSearch extends App {
  val logger = LoggerFactory.getLogger(classOf[TimeChecker])

  val WORST_CASE_NUMBER = 1000000000 // 1_000_000_000
  val sequence = SequenceGenerator.generateSimpleSequence(WORST_CASE_NUMBER)

  val timeChecker = new TimeChecker()
  timeChecker.printCurrent()

  breakable {
    for(value <- sequence) {
      if(value == WORST_CASE_NUMBER) {
        timeChecker.printCurrent()
        logger.info("Find value: {}", value)
        break
      }
    }
  }
}
