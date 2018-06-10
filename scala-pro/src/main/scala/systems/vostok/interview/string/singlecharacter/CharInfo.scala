package systems.vostok.interview.string.singlecharacter

class CharInfo(val character: Char, var num: Long, var isUnique: Boolean) {
  def this(character: Char) {
    this(character, 1, true)
  }

  def registerCharacter(): Unit = {
    num += 1
    isUnique = false
  }
}
