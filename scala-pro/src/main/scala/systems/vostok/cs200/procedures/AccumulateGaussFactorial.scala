package systems.vostok.cs200.procedures

object AccumulateGaussFactorial extends App {

  println(recursionCalculator(sumAccumulate, 100))
  println(recursionCalculator(multiplyAccumulate, 100))


  def sumAccumulate(i: BigInt, j: BigInt): BigInt = {
    i + j
  }

  def multiplyAccumulate(i: BigInt, j: BigInt): BigInt = {
    i * j
  }

  def recursionCalculator(f: (BigInt, BigInt) => BigInt, i: BigInt): BigInt = {
    if (i == 1) 1 else f(i, recursionCalculator(f, i - 1))
  }
}
