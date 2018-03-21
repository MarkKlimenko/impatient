package systems.vostok.oreilly.skyline

class Building(var left: Int, var right: Int, var height: Int) {
  require(
    left > 0 && right > 0 && height > 0,
    "Variable must be a positive number"
  )
  require(
    left < right,
    "Wrong left/right coordinates"
  )

  override def toString: String = {
    s"left:$left right:$right height:$height"
  }
}
