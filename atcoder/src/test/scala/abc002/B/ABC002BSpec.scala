package abc002.B

import abc002.B
import org.scalatest.{FlatSpec, Matchers}

/**
  * Copyright 2018 tuxedocat
  */
class ABC002BSpec extends FlatSpec with Matchers {

  "this" should "pass ex001" in {
    val result = B.Main.solve("chokudai")
    result shouldBe "chkd"
  }
  "this" should "pass ex002" in {
    val result = B.Main.solve("okanemochi")
    result shouldBe "knmch"
  }
  "this" should "pass ex003" in {
    val result = B.Main.solve("aoki")
    result shouldBe "k"
  }
  "this" should "pass ex004" in {
    val result = B.Main.solve("mazushii")
    result shouldBe "mzsh"
  }
}
