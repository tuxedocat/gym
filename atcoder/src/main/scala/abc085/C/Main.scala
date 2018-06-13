package abc085.C

/**
  * Current status:
  */
object Main extends App {
  def solve(n: Int, y: Int): (Int, Int, Int) = {
    import scala.collection.mutable.ListBuffer
    var r = new ListBuffer[(Int, Int, Int)]()
    for {
      i <- 0 to n
      j <- 0 to (n - i)
    } {
      val k = n - i - j
      if (10000 * i + 5000 * j + 1000 * k == y) { r += ((i, j, k)) }
    }
    if (r.isEmpty) (-1, -1, -1) else r.head
  }

  val scanner = new java.util.Scanner(Console.in)
  val n = scanner.nextInt()
  val y = scanner.nextInt()
  val ans = solve(n, y)
  println(s"${ans._1} ${ans._2} ${ans._3}")
}
