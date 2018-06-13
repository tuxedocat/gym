package abc081.A

import org.scalatest._

class ABC081ASpec extends FlatSpec with Matchers {

  "prob" should "pass1" in {
    val result = abc081.A.Main.solve("101")
    result shouldBe 2
  }

  it should "pass2" in {
    val result = abc081.A.Main.solve("000")
    result shouldBe 0
  }
}
