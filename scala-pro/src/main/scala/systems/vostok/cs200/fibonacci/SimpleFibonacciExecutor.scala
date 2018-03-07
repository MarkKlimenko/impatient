package systems.vostok.cs200.fibonacci

import java.util.concurrent.{ExecutorService, Executors}

import scala.collection.mutable.ArrayBuffer

class SimpleFibonacciExecutor {

  val pool: ExecutorService = Executors.newSingleThreadExecutor()
  val operationProgressStore = new ArrayBuffer[Long]()


  def calculateFibonacci(iterations: Long): BigInt = {
    try {
      executeCalculation(iterations)
    } finally {
      pool.shutdown()
    }
  }

  def executeCalculation(iterations: Long): BigInt = {
    operationProcess(iterations)

    if (iterations == 1 || iterations == 2) {
      1
    } else {
      executeCalculation(iterations - 1) + executeCalculation(iterations - 2)
    }
  }

  def operationProcess(iterations: Long): Unit = {
    pool.submit(new Runnable {
      override def run(): Unit = {
//        if (!operationProgressStore.contains(iterations)) {
//          operationProgressStore += iterations
//          print(s"$iterations ")
//        }
        print(s"$iterations ")
      }
    })
  }
}