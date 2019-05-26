package abc045.B

/**
  * Current status:
  */
object Main extends App {

  def solve(sa: String, sb: String, sc: String): String = {
    def f(turn: Char, a: List[Char], b: List[Char], c: List[Char]): (Char, List[Char], List[Char], List[Char]) = {
      if (turn == 'a' && a.isEmpty) ('a', List(), List(), List())
      else if (turn == 'b' && b.isEmpty) ('b', List(), List(), List())
      else if (turn == 'c' && c.isEmpty) ('c', List(), List(), List())
      else {
        if (turn == 'a') f(a.head, a.tail, b, c)
        else if (turn == 'b') f(b.head, a, b.tail, c)
        else f(c.head, a, b, c.tail)
      }
    }
    val (whoWon, _, _, _) = f('a', sa.toCharArray.toList, sb.toCharArray.toList, sc.toCharArray.toList)
    whoWon.toString.toUpperCase
  }

  val scanner = new java.util.Scanner(Console.in)
  val sa = scanner.next()
  val sb = scanner.next()
  val sc = scanner.next()
  val ans = solve(sa, sb, sc)
  println(ans)
}
