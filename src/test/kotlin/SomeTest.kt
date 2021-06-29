import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.string.shouldHaveLength

class SomeTest : FunSpec(
    {
        test("hello") {
            "hello".shouldHaveLength(5)
        }
    }
)
