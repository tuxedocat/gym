package abc086.C

import org.scalatest._

class ABC086CSpec extends FlatSpec with Matchers {

  "prob" should "pass1" in {
    val plan = List((3, 1, 2), (6, 1, 1))
    val result = abc086.C.Main.solve(plan)
    result shouldBe true
  }
  it should "pass2" in {
    val plan = List((2, 100, 100))
    val result = abc086.C.Main.solve(plan)
    result shouldBe false
  }
  it should "pass3" in {
    val plan = List((5, 1, 1), (100, 1, 1))
    val result = abc086.C.Main.solve(plan)
    result shouldBe false
  }
}
