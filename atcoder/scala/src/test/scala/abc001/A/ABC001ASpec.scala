package abc001.A

import abc001.A.Main
import org.scalatest._

class ABC001ASpec extends FlatSpec with Matchers {

  "abc001-1 001" should "be 5" in {
    val input = Array(15, 10)
    val output = 5
    val result = Main.solve(input(0), input(1))
    result shouldBe output
  }

  "abc001-1 002" should "be 0" in {
    val input = Array(0, 0)
    val output = 0
    val result = Main.solve(input(0), input(1))
    result shouldBe output
  }

  "abc001-1 003" should "be -15" in {
    val input = Array(5, 20)
    val output = -15
    val result = Main.solve(input(0), input(1))
    result shouldBe output
  }
}
