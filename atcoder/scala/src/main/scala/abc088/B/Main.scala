package abc088.B

/**
  * Current status:
  */
object Main extends App {

  def solve(l: List[Int]): Int = {
    val ls = l.sorted.reverse.zipWithIndex
    val alice = ls.filter(_._2 % 2 == 0).map(_._1).sum
    val bob = ls.filter(_._2 % 2 != 0).map(_._1).sum
    alice - bob
  }

  val scanner = new java.util.Scanner(Console.in)
  val n = scanner.nextInt()
  val l = List.fill(n)(scanner.nextInt())
  val ans = solve(l)
  println(ans)
}
