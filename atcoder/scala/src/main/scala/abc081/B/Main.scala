package abc081.B

/**
  * Current status:
  */
object Main extends App {

  def solve(a: List[Int]): Int = {
    def rec(l: List[Int], cur: Int): (List[Int], Int) = {
      if (l.forall(_ % 2 == 0)) rec(l.map(_ / 2), cur + 1)
      else (Nil, cur)
    }

    val (_, n) = rec(a, 0)
    n
  }

  val scanner = new java.util.Scanner(Console.in)
  val n = scanner.nextInt()
  val a = List.fill(n)(scanner.nextInt())
  val ans = solve(a)
  println(ans)
}
