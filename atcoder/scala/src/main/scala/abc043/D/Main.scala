package abc043.D

/**
  * Current status: AC (but read the editorial)
  */
object Main extends App {

  def solve(s: String): (Int, Int) = {
    def inner(cs: List[(Char, Int)]): (Int, Int) = cs match {
      case (c1, i1) :: (_, _) :: (c3, i3) :: _ if c1 == c3 => (i1 + 1, i3 + 1)
      case (c1, i1) :: (c2, i2) :: _ if c1 == c2           => (i1 + 1, i2 + 1)
      case _ :: tail                                       => inner(tail)
      case _                                               => (-1, -1)
    }
    val cs = s.toCharArray.zipWithIndex.toList
    inner(cs)
  }

  val sc = new java.util.Scanner(Console.in)
  val s  = sc.next()
  val t  = solve(s)
  println(s"${t._1} ${t._2}")
}
