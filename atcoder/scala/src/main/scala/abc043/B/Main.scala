package abc043.B

/**
  * Current status: AC
  */
object Main extends App {

  def solve(inputs: Array[Char]) = {
    def inner(ss: Array[Char], inps: Array[Char]): (Array[Char], Array[Char]) = {
      if (inps.isEmpty) (ss, Array())
      else {
        if (inps.head == 'B') inner(ss.take(ss.length - 1), inps.tail)
        else inner(ss ++ Array(inps.head), inps.tail)
      }
    }

    val (output, inps) = inner(Array(): Array[Char], inputs)
    output.mkString

  }

  val sc = new java.util.Scanner(Console.in)
  val s  = sc.next().toCharArray
  println(solve(s))
}
