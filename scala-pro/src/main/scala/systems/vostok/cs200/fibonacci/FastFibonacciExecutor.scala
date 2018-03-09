package systems.vostok.cs200.fibonacci

class FastFibonacciExecutor {
  def calculateFibonacci(iterations: Long): BigInt = {
    executeCalculation(1, 1, iterations - 2)
  }

  def executeCalculation(prevPrevNum: BigInt, prevNum: BigInt, leftIterations: Long): BigInt = {
    if (leftIterations <= 0) {
      prevNum
    } else {
      executeCalculation(prevNum, prevPrevNum + prevNum, leftIterations - 1)
    }
  }
}