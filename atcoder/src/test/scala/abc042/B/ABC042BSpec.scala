package abc042.B

import org.scalatest.{FlatSpec, Matchers}

/**
  * Copyright 2018 tuxedocat
  */
class ABC042BSpec extends FlatSpec with Matchers {

  "Str sorter" should "pass ex001" in {
    val result = Main.solve(Array("dxx", "axx", "cxx"))
    result shouldBe "axxcxxdxx"
  }

  it should "work with others 1" in {
    val result = Main.solve(Array("edxx", "axxd", "zxxc"))
    result shouldBe "axxdedxxzxxc"
  }

}
