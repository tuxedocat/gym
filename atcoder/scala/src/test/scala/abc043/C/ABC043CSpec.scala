package abc043.C

import org.scalatest.{FlatSpec, Matchers}

/**
  * Copyright 2018 tuxedocat
  */
class ABC043CSpec extends FlatSpec with Matchers {

  "be together" should "pass ex001" in {
    val ns     = List(4, 8)
    val result = Main.solve(ns)
    result shouldBe 8
  }

  it should "pass ex002" in {
    val ns     = List(1, 1, 3)
    val result = Main.solve(ns)
    result shouldBe 3
  }

  it should "pass ex003" in {
    val ns     = List(4, 2, 5)
    val result = Main.solve(ns)
    result shouldBe 5
  }

  it should "pass ex004" in {
    val ns     = List(-100, -100, -100, -100)
    val result = Main.solve(ns)
    result shouldBe 0
  }
}
