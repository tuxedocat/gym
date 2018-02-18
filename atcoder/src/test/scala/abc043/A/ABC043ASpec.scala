package abc043.A

import org.scalatest.{FlatSpec, Matchers}

/**
  * Copyright 2018 tuxedocat
  */
class ABC043ASpec extends FlatSpec with Matchers {

  "candy counter" should "pass ex001" in {
    val n = 3
    val result = Main.solve(n)
    result shouldBe 6
  }

  it should "pass ex002" in {
    val n = 10
    val result = Main.solve(n)
    result shouldBe 55
  }
}
