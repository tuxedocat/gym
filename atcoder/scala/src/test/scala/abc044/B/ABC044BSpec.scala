package abc044.B

import org.scalatest._

class ABC044BSpec extends FlatSpec with Matchers {

  "beautiful strings" should "pass 1" in {
    val input = "abaccaba"
    val output = true
    val result = abc044.B.Main.solve(input)
    result shouldBe output
  }
  it should "pass 2" in {
    val input = "hthth"
    val output = false
    val result = abc044.B.Main.solve(input)
    result shouldBe output
  }
  it should "pass 3" in {
    val input = "abcdefgabcdefgabcdefg"
    val output = false
    val result = abc044.B.Main.solve(input)
    result shouldBe output
  }
}
