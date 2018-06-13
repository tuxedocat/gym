package abc085.B

import org.scalatest._

class ABC085BSpec extends FlatSpec with Matchers {

  "Kagami Mochi" should "pass1" in {
    val result = abc085.B.Main.solve(List(10, 8, 8, 6))
    result shouldBe 3
  }
  it should "pass2" in {
    val result = abc085.B.Main.solve(List(15, 15, 15))
    result shouldBe 1
  }
  it should "pass3" in {
    val result = abc085.B.Main.solve(List(50, 30, 50, 100, 50, 80, 30))
    result shouldBe 4
  }
}
