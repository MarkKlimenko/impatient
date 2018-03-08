package systems.vostok.cs200.fibonacci

import systems.vostok.cs200.fibonacci.cache.{CacheAdapter, CustomCacheManager}

class CachedFibonacciExecutor {

  val cacheAdapter = new CacheAdapter[Long, BigInt](CustomCacheManager.universalCache)

  def calculateFibonacci(iterations: Long): BigInt = {
    cacheAdapter.getOrUpdate(iterations, executeCalculation)
  }

  def executeCalculation(iterations: Long): BigInt = {
    if (iterations == 1 || iterations == 2) {
      1
    } else {
      calculateFibonacci(iterations - 1) + calculateFibonacci(iterations - 2)
    }
  }
}