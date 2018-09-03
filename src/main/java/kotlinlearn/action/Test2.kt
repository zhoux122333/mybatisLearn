package action

interface Expr

class Num(val value: Int): Expr

class Sum(val left: Expr,val right: Expr): Expr

fun main(args: Array<String>) {
    println()
}