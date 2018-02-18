package abc001.A

/**
  * Copyright 2018 tuxedocat
  */
object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val h1, h2 = sc.nextInt()
  assert(h1 >= 0)
  assert(h2 >= 0)
  println(solve(h1, h2))

  def solve(n1: Int, n2: Int) = n1 - n2
}
