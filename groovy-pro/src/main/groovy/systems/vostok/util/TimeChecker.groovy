package systems.vostok.util;

import groovy.util.logging.Slf4j;

@Slf4j
class TimeChecker {
  Long initialTime
  Map<String,Long> pointStore = [:]

  private TimeChecker() {

  }

  static TimeChecker init() {
    new TimeChecker().with {
      initialTime = System.currentTimeMillis()
      it
    }
  }

  TimeChecker reInit() {
    initialTime = System.currentTimeMillis()
    this
  }

  Long printCurrent(String pointName) {
    Long checkedTime = System.currentTimeMillis() - initialTime
    log.info("Point name: {} -> Checked time: {}", pointName, checkedTime)
    checkedTime
  }

  static checkExecutionTime(String pointName, Closure closure) {
    TimeChecker t = init()
    closure.call()
    t.printCurrent(pointName)
  }
}