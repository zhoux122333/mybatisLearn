package action

import java.util.*

val binrayReps = TreeMap<Char,String>()

fun main(args: Array<String>) {
    for (c in 'A'..'F'){
        val binary = Integer.toBinaryString(c.toInt())
        binrayReps[c] = binary
    }

    for ((letter,binary) in binrayReps){
        println("$letter = $binary")
    }
}