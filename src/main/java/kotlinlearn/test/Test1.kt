package test

sealed class  Expr {
    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()
}
//
//fun eval(e: Expr): Int{
//    return when(e){
//        is Num -> e.value
//        is Sum -> eval(e.left) + eval(e.left)
//        else -> throw IllegalArgumentException("Unknown expression")
//    }
//}
fun eva(e: Expr): Int =
        when(e){
            is Expr.Num -> e.value
            is Expr.Sum -> eva(e.left)+ eva(e.right)
        }