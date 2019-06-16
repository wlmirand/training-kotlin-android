package william.miranda.playground.instructor._7Lambdas


fun higherOrder(value: String, op: (String) -> String): String {
    println("Executing the operation $op")
    return op(value)
}

val toLowercase = { value: String -> value.toLowerCase() }
fun lowercaseFunction(value: String) = value.toLowerCase()



fun createPowerFunction(power: Int): (Int) -> Int {
    return { number ->
        var result = 1
        for (i in 1..power)
            result *= number

        result
    }
}


fun main() {
    println(higherOrder("HELLO", toLowercase))
    println(higherOrder("HELLO", ::lowercaseFunction))

    val squareFunction = createPowerFunction(2)
    val cubeFunction = createPowerFunction(3)

    println(squareFunction(2))
    println(cubeFunction(2))
}
