package abc087.B

/**
  * Current status:
  */
object Main extends App {

  def solve(a: Int, b: Int, c: Int, x: Int): Int = {
    val r = {
      for {
        na <- 0 to a
        nb <- 0 to b
        nc <- 0 to c
      } yield (na, nb, nc)
    }
    r.toSet.count(t => 500 * t._1 + 100 * t._2 + 50 * t._3 == x)
  }

  val scanner = new java.util.Scanner(Console.in)
  val a = scanner.nextInt()
  val b = scanner.nextInt()
  val c = scanner.nextInt()
  val x = scanner.nextInt()
  val ans = solve(a, b, c, x)
  println(ans)
}
