package abc043.C

/**
  * Current status: AC
  */
object Main extends App {

  def solve(ns: List[Int]): Int = {
    val r = for (m <- -100 to 100) yield { ns.map(_.toDouble).map(x => math.pow(x - m, 2)).sum.toInt }
    r.min
  }

  val sc = new java.util.Scanner(Console.in)
  val n  = sc.nextInt()
  val ns = List.fill(n)(sc.nextInt())
  println(solve(ns))
}
