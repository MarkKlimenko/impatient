package systems.vostok.cs200.fibonacci.cache

import net.sf.ehcache.Cache
import net.sf.ehcache.CacheManager

object CustomCacheManager {
  val singletonManager: CacheManager = CacheManager.create

  singletonManager.addCache(new Cache("universalCache", 5000, false, false, 5, 2))

  val universalCache: Cache = singletonManager.getCache("universalCache")
}
