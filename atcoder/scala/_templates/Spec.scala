package {{pkgname}}

import org.scalatest._

class {{clsname}} extends FlatSpec with Matchers {

  "prob" should "pass1" in {
    val input = 1
    val output = 5
    val result = 5
    val result = {{pkgname}}.Main.solve(input)
    result shouldBe output
  }
}
