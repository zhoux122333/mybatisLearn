import action.JoinToString
import action.lastChar

fun main(args: Array<String>) {
    val a= 10000
//    print(a == a)
//
//    if (a == 100) print(a) else print(a - 100)
//    val c =0
//    c = { a: Int, b: Int -> (a + b):Int }
//    c
    println("a=$a")
    val x = 0
    when(x){
        1,0 -> println("111")

        else ->{
            println("ss")
        }
    }

    for (x in 1..10) println(x)
    val list = listOf(1,2,3)
    JoinToString(list,"",",","").lastChar()
}

