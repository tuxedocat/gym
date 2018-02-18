package abc002.C

/**
  * Copyright 2018 tuxedocat
  */
object Main extends App {
  def solve(xa: Int, ya: Int, xb: Int, yb: Int, xc: Int, yc: Int): Double = {
    val x1 = xb - xa
    val y1 = yb - ya
    val x2 = xc - xa
    val y2 = yc - ya
    math.abs(x1 * y2 - x2 * y1) / 2.0
  }

  val sc = new java.util.Scanner(Console.in)
  val xa, ya, xb, yb, xc, yc = sc.nextInt()
  println(solve(xa, ya, xb, yb, xc, yc))
}
