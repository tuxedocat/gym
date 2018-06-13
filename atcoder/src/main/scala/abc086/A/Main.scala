package abc086.A

/**
  * Current status:
  */
object Main extends App {
  import scala.math

  def solve(x: Int, y: Int): String = {
    if (math.abs(x * y % 2) == 0) "Even"
    else "Odd"
  }

  val scanner = new java.util.Scanner(Console.in)
  val a = scanner.nextInt()
  val b = scanner.nextInt()
  val ans = solve(a, b)
  println(ans)
}
