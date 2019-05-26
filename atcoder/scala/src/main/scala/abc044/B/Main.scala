package abc044.B

/**
  * Current status:
  */
object Main extends App {

  def solve(s: String): Boolean = {
    val chars = s.toCharArray.toSet
    val counts = { for (c <- chars) yield s.count(_ == c) }
    counts.forall(_ % 2 == 0)
  }

  val sc = new java.util.Scanner(Console.in)
  val s = sc.next()
  val ans = solve(s)
  if (ans) print("Yes") else println("No")
}
