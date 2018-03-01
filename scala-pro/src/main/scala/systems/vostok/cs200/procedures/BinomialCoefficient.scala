package systems.vostok.cs200.procedures

// “n choose k” problem
object BinomialCoefficient extends App {
  println(s"Factorial: ${binomialCoefficient(54, 3).toString}")

  def binomialCoefficient(nDeck: BigInt, kChoice: BigInt): BigInt = {
    factorial(nDeck)/factorial(nDeck-kChoice)/factorial(kChoice)
  }

  def factorial(number: BigInt): BigInt = {
    if (number == 1) 1 else number * factorial(number - 1)
  }
}
