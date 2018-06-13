package abc085.B

/**
  * Current status:
  */
object Main extends App {

  def solve(l: List[Int]): Int = {
    l.toSet.toList.sorted.length
  }

  val scanner = new java.util.Scanner(Console.in)
  val n = scanner.nextInt()
  val l = List.fill(n)(scanner.nextInt())
  val ans = solve(l)
  println(ans)
}
