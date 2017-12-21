package abc001_2

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val m = sc.nextDouble() / 1000

  val vv = {
    if (m < 0.1) "00"
    else if (0.1 <= m && m <= 5.0) f"${(m * 10).toInt}%02d"
    else if (6.0 <= m && m <= 30.0) f"${(m + 50).toInt}%02d"
    else if (35.0 <= m && m <= 70.0) f"${((m - 30) / 5 + 80).toInt}%02d"
    else if (m >= 70.0) "89"
  }
  println(vv)
}
