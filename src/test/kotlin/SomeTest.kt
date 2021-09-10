import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldHaveLength

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
    }
)
