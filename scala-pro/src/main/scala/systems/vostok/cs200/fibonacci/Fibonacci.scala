package systems.vostok.cs200.fibonacci

import systems.vostok.cs200.fibonacci.cache.{CacheAdapter, CustomCacheManager}

object Fibonacci extends App {

  //print(new SimpleFibonacciExecutor().calculateFibonacci(6))
  //new SimpleFibonacciExecutor().calculateFibonacci(7)

  print(new CachedFibonacciExecutor().calculateFibonacci(60))


}
