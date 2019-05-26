package abc083.B

/**
  * Current status:
  */
object Main extends App {

  def solve(n: Int, a: Int, b: Int): Int = {
    val r = for (i <- 1 to n) yield {
      val s = i.toString.toCharArray.map(_.asDigit).sum
      if (s >= a && s <= b) i
      else 0
    }
    r.sum
  }

  val scanner = new java.util.Scanner(Console.in)
  val n = scanner.nextInt()
  val a = scanner.nextInt()
  val b = scanner.nextInt()
  val ans = solve(n, a, b)
  println(ans)
}
