package abc042.C

/**
  * Current status:
  */
object Main extends App {

  def solve(n: Int, es: Seq[String]): Int = {
    Stream.from(n).find(_.toString.forall(d => !es.contains(d.toString))).get
  }

  val sc = new java.util.Scanner(Console.in)
  val n, k = sc.nextInt()
  val exclude = { for (_ <- 1 to k) yield sc.next() }.toVector

  println(solve(n, exclude))
}
