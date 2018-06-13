package abc081.A

/**
  * Current status:
  */
object Main extends App {

  def solve(s: String): Int = {
    s.toCharArray.count(_ == '1')
  }

  val scanner = new java.util.Scanner(Console.in)
  val s = scanner.next()
  val ans = solve(s)
  println(ans)
}
