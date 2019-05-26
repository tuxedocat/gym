package abc001.D

/**
  * Current Status: not submitted yet
  */
object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt()
  val inputs = { for (_ <- 1 to n) yield parseIntervalsToMinutes(sc.next()) }.toArray
  val startTimes = inputs.map(_._1).distinct.sorted
  val endTimes = inputs.map(_._2).distinct.sorted
  val intervals = { for (i <- 1 to 12) yield i }
  for (s <- solve(startTimes, endTimes)) println(s)

  def solve(ss: Array[Int], es: Array[Int]): Array[String] = {
    Array("mochimochi")
  }

  def parseIntervalsToMinutes(s: String): (Int, Int) = {
    val intervalPattern = """(\d{2})(\d{2})-(\d{2})(\d{2})""".r
    val (b, e) = s match {
      case intervalPattern(h1, m1, h2, m2) =>
        (convertToMinutes(h1.toInt, m1.toInt),
         convertToMinutes(h2.toInt, m2.toInt))
      case _ => (-1, -1)
    }
    (b, e)
  }

  def convertToMinutes(h: Int, m: Int, isEnd: Boolean = false): Int = {
    val min = h * 60 + m
    if (!isEnd) roundMinutes(min) else roundMinutes(min, roundUp = true)
  }

  def roundMinutes(m: Int, roundUp: Boolean = false): Int = {
    val base = 5
    val (mul, rem) = (m / base, m % base)
    if (roundUp) base * mul + 5 else base * mul
  }

  def convertToString(minutes: Int): String = {
    val (h, m) = (minutes / 60, minutes % 60)
    f"$h%02d$m%02d"
  }
}
