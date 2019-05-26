package abc043.D

import org.scalatest.{FlatSpec, Matchers}

/**
  * Copyright 2018 tuxedocat
  */
class ABC043DSpec extends FlatSpec with Matchers {

  "unbalance string" should "pass ex001" in {
    val s = "needed"
    val t = Main.solve(s)
    (t._1, t._2) shouldBe (2, 3)
  }
  it should "pass ex002" in {
    val s = "atcoder"
    val t = Main.solve(s)
    (t._1, t._2) shouldBe (-1, -1)
  }
  it should "pass ex003" in {
    val s = "at"
    val t = Main.solve(s)
    (t._1, t._2) shouldBe (-1, -1)
  }
  it should "pass ex004" in {
    val s = ""
    val t = Main.solve(s)
    (t._1, t._2) shouldBe (-1, -1)
  }
}
