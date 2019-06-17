package william.miranda.playground.instructor._2ControlStructures

//Statement if
fun max(a: Int, b: Int): Int {
    if (a > b)
        return a
    else
        return b
}

//Expression if
fun max2(a: Int, b: Int): Int {
    return if (a > b)
        a
    else
        b
}

//Simplified return
fun max3(a: Int, b: Int) = if (a > b) a else b

enum class State {
    COLD, MILD, HOT
}

fun updateWeather(celsiusDegrees: Double): State {
    val state: State
    when {
        celsiusDegrees < 0 -> state = State.COLD
        celsiusDegrees in 0f..15f -> state = State.MILD
        else -> state = State.HOT
    }

    return state
}

fun updateWeather2(celsiusDegrees: Double): State {
    return when {
        celsiusDegrees < 0 -> State.COLD
        celsiusDegrees in 0f..15f -> State.MILD
        else -> State.HOT
    }
}

fun anotherWhen(value: Int) {
    val primes = arrayOf(2,3,5,7,11,13,17,19)

    when(value) {
        0,1 -> println("value == 0 or value == 1")
        in primes -> println("value is prime")
        !in 10..20 -> println("value is not in range")
        else -> println("none of the above")
    }
}

fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "It's a digit!"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
    else -> "I don't know"
}

fun forElements() {
    val primes = arrayOf(2,3,5,7,11,13,17,19)

    for (i in primes)
        println(i)
}

fun forIndex() {
    val primes = arrayOf(2,3,5,7,11,13,17,19)

    for (i in 0 until primes.size)
        println(primes[i])
}

fun main() {
    //println(max(3, 5))
    //println(max2(3, 5))
    //println(max3(3, 5))

    //println(updateWeather(4.0))
    //println(updateWeather2(4.0))

    //anotherWhen(16)

    forIndex()
}