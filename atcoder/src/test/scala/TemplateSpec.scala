import abc001.A.Main
import org.scalatest._

class TemplateSpec extends FlatSpec with Matchers {

  "prob x" should "pass" in {
    val input = Array(15, 10)
    val output = 5
    val result = Main.solve(input(0), input(1))
    result shouldBe output
  }
}
