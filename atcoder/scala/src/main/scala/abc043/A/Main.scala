package abc043.A

/**
  * Current status: AC
  */
object Main extends App {

  def solve(n: Int): Int = {
    (n * (n + 1)) / 2
  }

  val sc = new java.util.Scanner(Console.in)
  val n = sc.nextInt()
  println(solve(n))
}
