package abc049.C

/**
  * Current status:
  */
object Main extends App {

  def solve(s: String): Boolean = {

    def inner(cs: List[Char]): Boolean = cs match {
      case List('r', 'e', 'm', 'a', 'e', 'r', 'd', tail @ _*) => inner(tail.toList)
      case List('r', 'e', 's', 'a', 'r', 'e', tail @ _*)      => inner(tail.toList)
      case List('m', 'a', 'e', 'r', 'd', tail @ _*)           => inner(tail.toList)
      case List('e', 's', 'a', 'r', 'e', tail @ _*)           => inner(tail.toList)
      case List()                                             => true
      case _                                                  => false
    }
    inner(s.reverse.toList)
  }

  val scanner = new java.util.Scanner(Console.in)
  val s = scanner.next()
  val ans = if (solve(s)) "YES" else "NO"
  println(ans)
}
