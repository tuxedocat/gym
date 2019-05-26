package abc002.D

import org.scalatest.{FlatSpec, Matchers}

/**
  * Copyright 2018 tuxedocat
  */
class ABC002DSpec extends FlatSpec with Matchers {

  "find faction" should "pass ex001" in {
    val result = Main.solve(5, 3, List((1, 2), (2, 3), (1, 3)))
    result shouldBe 3
  }

  it should "pass ex002" in {
    val result = Main.solve(5, 3, List((1, 2), (2, 3), (3, 4)))
    result shouldBe 2
  }

  it should "pass ex003" in {
    val result = Main.solve(7,
                            9,
                            List((1, 2),
                                 (1, 3),
                                 (2, 3),
                                 (4, 5),
                                 (4, 6),
                                 (4, 7),
                                 (5, 6),
                                 (5, 7),
                                 (6, 7)))
    result shouldBe 4
  }

  it should "pass ex004" in {
    val result = Main.solve(12, 0, List())
    result shouldBe 1
  }

}
