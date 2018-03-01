package systems.vostok.cs200.procedures

object GaussSum extends App {

  val TARGET_INT = 100

  println(calculateGsFormula(TARGET_INT))
  println(calculateGsRecursion(TARGET_INT))
  assert(calculateGsFormula(TARGET_INT) == calculateGsRecursion(TARGET_INT))

  def calculateGsFormula(i: Int): Int = {
    i * (i + 1) / 2
  }

  def calculateGsRecursion(i: Int): Int = {
    if(i == 1) 1 else i + calculateGsRecursion(i - 1)
  }
}
