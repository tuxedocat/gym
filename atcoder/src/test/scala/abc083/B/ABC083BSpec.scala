package abc083.B

import org.scalatest._

class ABC083BSpec extends FlatSpec with Matchers {

  "prob" should "pass1" in {
    val result = abc083.B.Main.solve(20, 2, 5)
    result shouldBe 84
  }
  it should "pass2" in {
    val result = abc083.B.Main.solve(10, 1, 2)
    result shouldBe 13
  }
  it should "pass3" in {
    val result = abc083.B.Main.solve(100, 4, 16)
    result shouldBe 4554
  }
}
