package action

fun fizzBuzz(i: Int) = when{
    i % 15 == 0 -> "fizzBuzz"
    i % 3 ==0 -> "fizz"
    i % 5 ==0 -> "buzz"
//    i % 15 == 0 -> "fizzBuzz"
    else -> "$i"
}

fun main(args: Array<String>) {
    for (i in 1..100){
        println(fizzBuzz(i))
    }
}