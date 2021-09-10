import io.kotest.common.ExperimentalKotest
import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldHaveLength

@ExperimentalKotest
class SomeTest : FunSpec(
    {
        context("data test") {
            withData(
                "a",
                "b"
            ) { s ->
                s shouldBe "a"
            }
        }

        test("other") { "a" shouldBe "a" }
    }
)
