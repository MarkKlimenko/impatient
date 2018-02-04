package systems.vostok.performance

import org.slf4j.LoggerFactory

class TimeChecker {
  val logger = LoggerFactory.getLogger(classOf[TimeChecker])

  var initialTime: Long = System.currentTimeMillis()
  var pointStore = Map[String, Long]()

  def reInit(): Long = {
    initialTime = System.currentTimeMillis()
    initialTime
  }

  def printCurrent(): Long = {
    val checkedTime = System.currentTimeMillis() - initialTime
    logger.info("Checked time: {}", System.currentTimeMillis() - initialTime)
    checkedTime
  }

  def setPoint(description: String): Unit = {
    pointStore += (description -> (System.currentTimeMillis() - initialTime))
  }

  def printPoints(): Unit = {
    for ((k, v) <- pointStore) {
      logger.info("Point store: {} -> {}", k, v)
    }
  }
}
