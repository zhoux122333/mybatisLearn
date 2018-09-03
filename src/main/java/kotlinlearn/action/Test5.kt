package action

val list = listOf(1,2,3,4)

fun main(args: Array<String>) {
    println(list.filter { it % 2== 0 })
    println(list.map { it*it })
    for (b in 1..10){
        println(b)
    }
    val list = listOf(1,2,3)
    JoinToString(list,"",",","")
}