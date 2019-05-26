package abc042.C

import org.scalatest.{FlatSpec, Matchers}

/**
  * Copyright 2018 tuxedocat
  */
class ABC042CSpec extends FlatSpec with Matchers {

  "Payment without certain numbers" should "pass ex001" in {
    val n = 1000
    val k = 8
    val input = Vector(1, 3, 4, 5, 6, 7, 8, 9).map(_.toString)
    val result = Main.solve(n, input)
    result shouldBe 2000
  }

  it should "work with others 1" in {
    val n = 9999
    val k = 1
    val input = Vector(0).map(_.toString)
    val result = Main.solve(n, input)
    result shouldBe 9999
  }
}
