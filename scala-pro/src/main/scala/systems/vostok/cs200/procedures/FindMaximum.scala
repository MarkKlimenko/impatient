package systems.vostok.cs200.procedures

object FindMaximum extends App {

  println(findMax(function1, 1, 20))
  println(findMax(function2, 1, 20))
  println(findMax(function3, 1, 20))

  def function1(x: Integer): Int = { x }
  def function2(x: Integer): Int = { 10 - x }
  def function3(x: Integer): Int = { x * (10 - x) }

  def findMax(f: (Integer) => Int, min: Int, max: Int): Integer = {
    (min to max).map{ f(_) }.max
  }
}
