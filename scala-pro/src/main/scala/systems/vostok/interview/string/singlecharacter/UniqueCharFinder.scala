package systems.vostok.interview.string.singlecharacter

import scala.collection.mutable

class UniqueCharFinder {
  val charMap: mutable.Map[Char, CharInfo] = mutable.Map[Char, CharInfo]()

  def findUnique(text: String): collection.Set[Char] = {
    text.foreach(processChar)
    charMap.retain((k, v) => v.isUnique).keySet
  }

  def processChar(char: Char): Unit = {
    val charInfo = charMap.get(char).orNull
    if (charInfo != null) {
      charInfo.registerCharacter()
    } else {
      charMap += (char -> new CharInfo(char))
    }
  }
}
