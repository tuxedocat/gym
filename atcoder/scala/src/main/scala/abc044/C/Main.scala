package abc044.C

/**
  * Current status: AC (read editorial)
  */
object Main extends App {
  import math.BigInt

  def solve(N: Int, A: Int, xs: List[Int]): BigInt = {
    val ys = Array(0) ++ xs.map(_ - A)
    val X = math.max(xs.max, A)
    val dp = Array.ofDim[BigInt](N + 1, 2 * N * X + 1)

    dp(0)(N * X) = 1
    for { j <- 0 to N; t <- 0 to 2 * N * X } {
      if (j == 0 && t == N * X) {
        dp(j)(t) = 1
      } else if (j >= 1 && (t - ys(j) < 0 || t - ys(j) > 2 * N * X)) {
        dp(j)(t) = dp(j - 1)(t)
      } else if (j >= 1 && (t - ys(j) >= 0 && t - ys(j) <= 2 * N * X)) {
        dp(j)(t) = dp(j - 1)(t) + dp(j - 1)(t - ys(j))
      } else {
        dp(j)(t) = 0
      }
    }
    val combs = dp(N)(N * X) - 1
    combs
  }

  val sc = new java.util.Scanner(Console.in)
  val n = sc.nextInt()
  val a = sc.nextInt()
  val nums = List.fill(n)(sc.nextInt())
  val ans = solve(n, a, nums)
  println(ans)
}
