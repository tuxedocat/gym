package abc045

import org.scalatest._

class ABC045Spec extends FlatSpec with Matchers {

  "abc045b" should "pass1" in {
    val s = "aca\naccc\nca".split('\n')
    val sa = s(0)
    val sb = s(1)
    val sc = s(2)
    val result = abc045.B.Main.solve(sa, sb, sc)
    result shouldBe "A"
  }
  it should "pass2" in {
    val s = "abcb\naacb\nbccc".split('\n')
    val sa = s(0)
    val sb = s(1)
    val sc = s(2)
    val result = abc045.B.Main.solve(sa, sb, sc)
    result shouldBe "C"
  }
}
