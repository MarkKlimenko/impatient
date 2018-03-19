package systems.vostok.oreilly.conversion

import scala.io.StdIn

object SimpleTemperatureConverter extends App {
  print("Enter value: ")
  print(s"Converted value: ${StdIn.readInt() * 9.0 / 5 + 32}")
}
