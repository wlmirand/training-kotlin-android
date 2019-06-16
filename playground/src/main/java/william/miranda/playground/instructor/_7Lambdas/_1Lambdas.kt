package william.miranda.playground.instructor._7Lambdas

//Explicit types
val factorial: (Int) -> Int = { number ->

    var result = 1
    for (i in 2..number) {
        result *= i
    }

    result
}

//Implicit types
val gcd = { a: Int, b: Int ->
    var a1 = a
    var b1 = b

    var remaining: Int
    while (b1 != 0) {
        remaining = a1 % b1
        a1 = b1
        b1 = remaining
    }
    a1
}

fun main() {
    println(factorial.invoke(5))
    println(gcd.invoke(252, 105))
}