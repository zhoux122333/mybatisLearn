
class TypedClass<T : Any>(parameter: T){
    var value: T = parameter
}

class Test6{
    val t1 = TypedClass<String>("Hello World!")
    val t2 = TypedClass<Int>(25).apply {
            println(value+2)
        value += 3
    }
//    val t3 = TypedClass<String?>(null) T:Any 不能为null
    fun printT(){
    t1.let {  println(it.value) }
        println(t1.value)
        println(t2.value)
//        println(t3)
    }

    //泛型函数
    fun <T> typedFunction(item: T) {
    }
}

fun main(args: Array<String>) {
    val test6 = Test6()
    test6.printT()
    val message: String
    
}