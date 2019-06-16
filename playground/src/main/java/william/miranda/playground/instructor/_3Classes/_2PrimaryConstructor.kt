package william.miranda.playground.instructor._3Classes

/* full syntax */
class Person2 constructor(name: String) {

    // property
    val name: String = name
}

/* short syntax */
class Person1(val name: String)

fun main() {
    val p1 = Person1("Alice")
    println(p1.name)

    val p2 = Person2("Alice")
    println(p2.name)
}
