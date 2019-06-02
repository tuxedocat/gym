package {{pkgname}}

import io.kotlintest.*
import io.kotlintest.specs.StringSpec

class {{clsname}} : StringSpec({
    "input 1 should be 43" {
        solve(42) shouldBe 43
    }
})