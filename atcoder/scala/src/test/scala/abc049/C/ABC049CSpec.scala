package abc049.C

import org.scalatest._

class ABC049CSpec extends FlatSpec with Matchers {

  "prob" should "pass1" in {
    val result = abc049.C.Main.solve("erasedream")
    result shouldBe true
  }
  it should "pass2" in {
    val result = abc049.C.Main.solve("dreameraser")
    result shouldBe true
  }
  it should "pass3" in {
    val result = abc049.C.Main.solve("dreamerer")
    result shouldBe false
  }
  it should "pass4" in {
    val result = abc049.C.Main.solve(List.fill(10000)("dreamerer").mkString(""))
    result shouldBe false
  }
  it should "pass5" in {
    val result = abc049.C.Main.solve(List.fill(10000)("dreameraser").mkString(""))
    result shouldBe true
  }
}
