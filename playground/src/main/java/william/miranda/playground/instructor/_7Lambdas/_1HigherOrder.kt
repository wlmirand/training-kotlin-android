package william.miranda.playground.instructor._7Lambdas


fun higherOrder(value: String, op: (String) -> String): String {
    println("Executing the operation $op")
    return op(value)
}

fun lowerCase(value: String) = value.toLowerCase()

fun main() {
    println(higherOrder("HELLO", ::lowerCase))
}
