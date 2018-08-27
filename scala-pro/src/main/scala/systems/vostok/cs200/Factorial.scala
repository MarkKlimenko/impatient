package systems.vostok.cs200

object Factorial extends App {

  //println(calculate(3000))
  println(calculateIterative(3000))

  def calculate(value: BigInt): BigInt = {
    if (value <= 1) {
      value
    } else {
      value * calculate(value - 1)
    }
  }

  def calculateIterative(value: BigInt): BigInt = {
      var result: BigInt = 1
      var iterative: BigInt = 1

    while(iterative <= value) {
      result *= iterative
      iterative += 1
    }
    result
  }
}
