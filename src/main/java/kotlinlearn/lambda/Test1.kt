package lambda

data class Person(val name: String, val age: Int)

fun findTheOldest(people : List<Person>){
    var maxAge = 0  //存储最大年龄

    var theOldest: Person? = null //存储最大年龄的人
    for (person in people){
        if (person.age > maxAge){
            maxAge = person.age
            theOldest = person
        }
    }
    println(theOldest)
}

fun main(args: Array<String>) {
    var people = listOf(Person("Alice",29), Person("Bob",31))
    findTheOldest(people)
    println(people.maxBy { person -> person.age  })

    val sum = {x:String,y: String -> x+ y}
    println(sum("zhou","xiang"))

    val getAge = Person::age
    run (::salute)

    grouBy()
}

fun grouBy() {
    val people = listOf(Person("Alice",31),
            Person("Bob",29), Person("Carol",31))
    println(people.groupBy { it.age})
}

fun salute() = println("哈哈")
