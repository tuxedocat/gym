package abc088.B

import org.scalatest._

class ABC088BSpec extends FlatSpec with Matchers {
  "prob" should "pass1" in {
    val result = abc088.B.Main.solve(List(3, 1))
    result shouldBe 2
  }
  it should "pass2" in {
    val result = abc088.B.Main.solve(List(2, 7, 4))
    result shouldBe 5
  }
  it should "pass3" in {
    val result = abc088.B.Main.solve(List(20, 18, 2, 18))
    result shouldBe 18
  }
}
