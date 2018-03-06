package abc044.C

import org.scalatest._

class ABC044CSpec extends FlatSpec with Matchers {

  "Tak and Card" should "pass 1" in {
    val n = 4
    val a = 8
    val numbers = List(7, 9, 8, 9)
    val output = 5
    val result = abc044.C.Main.solve(n, a, numbers)
    result shouldBe output
  }
  it should "pass 2" in {
    val n = 3
    val a = 8
    val numbers = List(6, 6, 9)
    val output = 0
    val result = abc044.C.Main.solve(n, a, numbers)
    result shouldBe output
  }
  it should "pass 3" in {
    val n = 8
    val a = 5
    val numbers = List(3, 6, 2, 8, 7, 6, 5, 9)
    val output = 19
    val result = abc044.C.Main.solve(n, a, numbers)
    result shouldBe output
  }
  it should "pass 4" in {
    val n = 33
    val a = 3
    val numbers = "3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3".split(' ').toList.map(_.toInt)
    val output = BigInt("8589934591")
    val result = abc044.C.Main.solve(n, a, numbers)
    result shouldBe output
  }

}
