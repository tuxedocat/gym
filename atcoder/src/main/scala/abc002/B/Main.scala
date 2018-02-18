package abc002.B

/**
  * Copyright 2018 tuxedocat
  */
object Main extends App {
  def solve(s: String): String = {
    s.replaceAll("[aiueo]", "")
  }

  val sc = new java.util.Scanner(Console.in)
  val s = sc.next()
  println(solve(s))
}
