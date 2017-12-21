package abc001_1

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val h1, h2 = sc.nextInt()
  assert(h1 >= 0)
  assert(h2 >= 0)
  println(h1 - h2)
}
