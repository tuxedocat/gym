package abc002.C

import abc002.C.Main
import org.scalatest.{FlatSpec, Matchers}

/**
  * Copyright 2018 tuxedocat
  */
class ABC002CSpec extends FlatSpec with Matchers {

  "this" should "pass ex001" in {
    val result = Main.solve(1, 0, 3, 0, 2, 5)
    result shouldBe 5.0
  }
  "this" should "pass ex002" in {
    val result = Main.solve(-1, -2, 3, 4, 5, 6)
    result shouldBe 2.0
  }
  "this" should "pass ex003" in {
    val result = Main.solve(298, 520, 903, 520, 4, 663)
    result shouldBe 43257.5
  }

}
