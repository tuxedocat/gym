package abc087.B

import org.scalatest._

class ABC087BSpec extends FlatSpec with Matchers {

  "prob" should "pass1" in {
    val result = abc087.B.Main.solve(2, 2, 2, 100)
    result shouldBe 2
  }

  it should "pass2" in {
    val result = abc087.B.Main.solve(5, 1, 0, 150)
    result shouldBe 0
  }
  it should "pass3" in {
    val result = abc087.B.Main.solve(30, 40, 50, 6000)
    result shouldBe 213
  }
}
