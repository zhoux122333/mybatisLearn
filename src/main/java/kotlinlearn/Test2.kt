fun foo(){
    listOf(1,2,3,4,5).forEach lit@ {
        if (it ==3) return@lit
        print(it)
    }
    println("this not return")
}

fun main(args: Array<String>) {
    foo()
    Test2(233)

    val Test2 = Test2(22);
}
class Test2(num : Int){
   private val age = num

    init {
        println(age)
    }
}