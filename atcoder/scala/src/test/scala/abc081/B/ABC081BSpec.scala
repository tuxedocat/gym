package abc081.B

import org.scalatest._

class ABC081BSpec extends FlatSpec with Matchers {

  "prob" should "pass1" in {
    val n = 3
    val a = Array(8, 12, 40).toList
    val output = 2
    val result = abc081.B.Main.solve(a)
    result shouldBe output
  }

  it should "pass2" in {
    val a = Array(5, 6, 8, 10).toList
    abc081.B.Main.solve(a) shouldBe 0
  }

  it should "pass3" in {
    val a = Array(382253568, 723152896, 37802240, 379425024, 404894720, 471526144).toList
    abc081.B.Main.solve(a) shouldBe 8
  }
}
