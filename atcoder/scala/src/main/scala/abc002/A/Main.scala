package abc002.A

/**
  * Copyright 2018 tuxedocat
  */
object Main extends App {
  def solve(x: Int, y: Int): Int = {
    assert(x != y)
    if (x > y) x else y
  }

  val sc = new java.util.Scanner(Console.in)
  val x, y = sc.nextInt()
  println(solve(x, y))
}
