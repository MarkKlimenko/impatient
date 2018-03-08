package systems.vostok.cs200.fibonacci.cache

import net.sf.ehcache.{Cache, Element}

class CacheAdapter[K, V](val cache: Cache) {

  def getOrUpdate(key: K, function:K => V): V = {
    val element: Element = cache.get(key)

    if (element != null) {
      element.getObjectValue.asInstanceOf[V]
    } else {
      val executionResult: V = function(key)
      cache.put(new Element(key, executionResult))
      executionResult
    }
  }
}
