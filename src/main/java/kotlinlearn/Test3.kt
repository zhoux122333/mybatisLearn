import kotlin.test.assertFalse
import kotlin.test.assertTrue

fun main(args: Array<String>) {
    val list = listOf(1,2,3,4,5,6)
  if (list.any{it%2 == 0}) println("true")
    else print("false")
assertFalse(list.any { it > 10 })
}