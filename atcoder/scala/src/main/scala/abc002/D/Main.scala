package abc002.D

/**
  * Current status: WA
  */
object Main extends App {

  import collection.immutable.{BitSet => BS}

  def solve(n: Int, m: Int, relations: Seq[(Int, Int)]): Int = {
    if (relations.isEmpty) 1
    else {
      val rels =
        relations.sortBy(_._1).sortBy(_._2).map(t => (t._1 - 1, t._2 - 1))

      val adj: Array[BS] = { for (i <- 0 until n) yield BS(i) }.toArray
      for (r <- rels) {
        val (a: Int, b: Int) = if (r._1 < r._2) (r._1, r._2) else (r._2, r._1)
        adj(a) += b
      }

      val targets = adj.toSet

      // Generate all combinations
      val combs = {
        for (i <- 0 to Math.pow(2, n + 1).toInt)
          yield
            BS.fromBitMask(Array(i)) // fromBitMask(Array(8)) will produce BitSet(3)
      }.toSet

      // Find possible patterns
      val is = targets & combs
      if (is.nonEmpty) is.toArray.map(_.size).max else 1
    }
  }

  val sc = new java.util.Scanner(Console.in)
  val n, m = sc.nextInt()
  val relations = {
    for (i <- 1 to m) yield (sc.nextInt, sc.nextInt)
  }.toArray
  println(solve(n, m, relations))
}
