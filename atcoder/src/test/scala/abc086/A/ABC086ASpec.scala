package abc086.A

import org.scalatest._

class ABC086ASpec extends FlatSpec with Matchers {

  "prob" should "pass 1" in {
    val output = "Even"
    val result = abc086.A.Main.solve(3, 4)
    result shouldBe output
  }

  it should "pass 2" in {
    abc086.A.Main.solve(1, 21) shouldBe "Odd"
  }
}
