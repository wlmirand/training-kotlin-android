package william.miranda.playground.instructor._3Classes

// Adding data makes the compiler generate useful methods
// such as equals, hashCode, toString.
data class Person(
        val name: String,
        val age: Int)

fun main() {
    val person1 = Person("Alice", 21)
    val person2 = Person("Alice", 22)
    println(person1)
    println(person1 == person2)
}