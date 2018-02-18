package abc002.A
import abc002.A

import org.scalatest.{FlatSpec, Matchers}

/**
  * Copyright 2018 tuxedocat
  */
class ABC002ASpec extends FlatSpec with Matchers {

  "this" should "return y if y > x" in {
    val result = A.Main.solve(10, 11)
    result shouldBe 11
  }

  it should "return x if x > y" in {
    val result = A.Main.solve(100000000, 10000000)
    result shouldBe 100000000
  }
}
