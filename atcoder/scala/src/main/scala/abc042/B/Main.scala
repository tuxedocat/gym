package abc042.B

/**
  * Current status:
  */
object Main extends App {

  def solve(arr: Array[String]): String = {
    arr.sorted.mkString("")
  }

  val sc = new java.util.Scanner(Console.in)
  val n, l = sc.nextInt()
  val ss = { for (i <- 1 to n) yield sc.next().trim }.toArray

  println(solve(ss))
}
