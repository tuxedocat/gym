package abc042.A

import org.scalatest.{FlatSpec, Matchers}

/**
  * Copyright 2018 tuxedocat
  */
class ABC042ASpec extends FlatSpec with Matchers {

  "575 checker" should "output YES for 5 5 7" in {
    val result = Main.solve(Array(5, 5, 7))
    result shouldBe true
  }

  it should "output NO for 7 7 5" in {
    val result = Main.solve(Array(7, 7, 5))
    result shouldBe false
  }

}
