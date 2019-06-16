package william.miranda.playground.instructor._3Classes

// similar to javaCode.Person

class AnotherPerson(val name: String, val age: Int)

fun main() {
    // no new keyword, constructor is called as a regular function
    val person = AnotherPerson("Alice", 26)
    println(person.name)
}