package abc085.C

import org.scalatest._

class ABC085CSpec extends FlatSpec with Matchers {

  "Otoshidama" should "pass1" ignore {
    val result = abc085.C.Main.solve(9, 45000)
    result shouldBe (4, 0, 5)
  }
  it should "pass2" in {
    val result = abc085.C.Main.solve(20, 196000)
    result shouldBe (-1, -1, -1)
  }
  it should "pass3" ignore {
    val result = abc085.C.Main.solve(1000, 1234000)
    result shouldBe (14, 27, 959)
  }
  it should "pass4" in {
    val result = abc085.C.Main.solve(2000, 20000000)
    result shouldBe (2000, 0, 0)
  }
}
