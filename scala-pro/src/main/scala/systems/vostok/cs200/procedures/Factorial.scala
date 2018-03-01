package systems.vostok.cs200.procedures

object Factorial extends App {

  println(s"Factorial: ${computeFactorial(1000).toString}")

  def computeFactorial(number: BigInt): BigInt = {
    if (number == 1) 1 else number * computeFactorial(number - 1)
  }
}
