package {{pkgname}}

import org.scalatest._

class {{clsname}} extends FlatSpec with Matchers {

  "prob" should "pass1" in {
    val input = Array(15, 10)
    val output = 5
    val result = 5
    val result = {{pkgname}}.Main(input)
    result shouldBe output
  }
}
