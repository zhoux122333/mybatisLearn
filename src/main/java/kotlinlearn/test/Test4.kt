package test

class Use (private val name: String){var address: String = "unspecified"
    set(value) {
        println("""
            Address was changed for $name:
            "$field" -> "$value".
        """.trimMargin()) //读取支持字段的值 更新支持字段的值
        field = value
    }
}

fun main(args: Array<String>) {
    var user = Use("Alice")
    user.address = "HuBei WuHan"

    val client = Client("Alice",342562)
    println(client)
}

class Client(val name: String,val postalCode: Int){
    override fun toString(): String {
        return "Client(name = $name, postalCode = $postalCode)"
    }

}

class DelegatingCollection<T>: Collection<T>{
    override val size: Int
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    override fun contains(element: T): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun containsAll(elements: Collection<T>): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isEmpty(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun iterator(): Iterator<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}


class DelegatingCollection1<T>(innerList : Collection<T> = ArrayList<T>()):Collection<T> by innerList{

}