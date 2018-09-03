fun main(args: Array<String>) {
    val a: Int? = null

    println(a.toString())

    val test = NullTest()
    val myObject: Any = test.getObject()!!
    println(myObject)
}