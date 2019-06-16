package william.miranda.playground

class Person(
    var name: String,
    var age: Int
) {

    //Immutable property with explicit type
    val motherName: String = "Maria"

    //Immutable property with implicit type
    val fatherName = "José"

    //Mutable property
    var accountBalance = 100

    //Property with custom getter
    val isPositive: Boolean
        get() = accountBalance >= 0

    //Property with getter and setter
    var example: Int = 5
        set(value) {
            field = value * 2
        }
        get() {
            return field + 1
        }
}

fun main() {
    val person = Person("Name", 30)
    println(person.example)

    person.example = 7
    println(person.example)
}