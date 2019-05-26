package abc086.C

/**
  * Current status:
  */
object Main extends App {

  def solve(plan: List[(Int, Int, Int)]): Boolean = {
    def step(p: List[(Int, Int, Int)], prev: (Int, Int, Int)): (List[(Int, Int, Int)], (Int, Int, Int)) = {
      p match {
        case List() => (List(), prev)
        case List((t, x, y), tail @ _*) =>
          val (tp, xp, yp) = prev match { case (a: Int, b: Int, c: Int) => (a, b, c) }
          val dt = t - tp
          val dl = math.abs(x - xp) + math.abs(y - yp)
          if (dl > dt || dt % 2 != dl % 2) (List(), (-1, -1, -1))
          else step(tail.toList, (t, x, y))
      }
    }
    val (_, g) = step(plan, (0, 0, 0))
    g != (-1, -1, -1)
  }

  val scanner = new java.util.Scanner(Console.in)
  val n = scanner.nextInt()
  val plan = { for (_ <- 1 to n) yield (scanner.nextInt(), scanner.nextInt(), scanner.nextInt()) }.toList
  val ans = solve(plan)
  if (ans) println("Yes") else println("No")
}
