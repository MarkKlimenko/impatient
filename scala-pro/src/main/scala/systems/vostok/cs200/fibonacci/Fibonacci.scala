package systems.vostok.cs200.fibonacci

import systems.vostok.performance.TimeChecker

object Fibonacci extends App {

  val timeChecker = new TimeChecker()

  //print(new SimpleFibonacciExecutor().calculateFibonacci(6))
  //print(new CachedFibonacciExecutor().calculateFibonacci(60)) //10 - 1251 ms //60 - 1210 ms
  print(new FastFibonacciExecutor().calculateFibonacci(60)) //10 - 300 ms //60 - 259 ms

  timeChecker.printCurrent()
}
