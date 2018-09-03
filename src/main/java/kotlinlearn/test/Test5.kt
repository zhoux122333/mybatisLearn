package test

import java.io.File

class ContingSet<T>(val innerSet: MutableCollection<T> = HashSet<T>()): MutableCollection<T> by innerSet{
    var objectsAdded = 0

    override fun add(element: T): Boolean {
        objectsAdded++
        return  innerSet.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        objectsAdded += elements.size
        return innerSet.addAll(elements)
    }
}

fun main(args: Array<String>) {
    val cset = ContingSet<Int>()
    cset.addAll(listOf(1,2,3))
    println("${cset.objectsAdded} ${cset.size} $cset")

    println(CaseInsensitiveFileComparator.compare(File("/User"),File("/user")))
}

object CaseInsensitiveFileComparator : Comparator<File>{
    override fun compare(o1: File, o2: File): Int {
        return o1.path.compareTo(o2.path,ignoreCase = true)
    }
}