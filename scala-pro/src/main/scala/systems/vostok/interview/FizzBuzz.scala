package systems.vostok.interview

object FizzBuzz extends App {
  private val FIZZ_MARK = "Fizz"
  private val BUZZ_MARK = "Buzz"
  private val FIZZ_BUZZ_MARK = "FizzBuzz"

  (1 to 100).foreach { number =>
    val isFizz = number % 3 == 0
    val isBuzz = number % 5 == 0

    if (isFizz && isBuzz) { println(FIZZ_BUZZ_MARK) }
    else if (isFizz) { println(FIZZ_MARK) }
    else if (isBuzz) { println(BUZZ_MARK) }
    else { println(number) }
  }
}