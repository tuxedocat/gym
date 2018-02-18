package abc043.B

import org.scalatest.{FlatSpec, Matchers}

/**
  * Copyright 2018 tuxedocat
  */
class UnhappyHacking extends FlatSpec with Matchers {

  "unhappy hacking" should "pass ex001" in {
    val s      = "01B0".toCharArray
    val result = Main.solve(s)
    result shouldBe "00"
  }

  it should "pass ex002" in {
    val s      = "0BB1".toCharArray
    val result = Main.solve(s)
    result shouldBe "1"
  }

  it should "pass ex003" in {
    val s      = "01BBBB".toCharArray
    val result = Main.solve(s)
    result shouldBe ""
  }
}
