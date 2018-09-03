package action

fun String.lastChar(): Char = this[length - 1]
fun String.last2Char():Char = get(length-2)

fun main(args: Array<String>) {
    println("zhouxiang".lastChar())
    println("zhouxiang".last2Char())
}