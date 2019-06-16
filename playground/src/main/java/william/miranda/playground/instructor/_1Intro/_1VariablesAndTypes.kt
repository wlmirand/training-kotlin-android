package william.miranda.playground.instructor._1Intro

fun main() {
    //Immutable
    val question: String = "life, the universe, and everything"
    println("$question?")

    //Cant change a VAL
    //question = "Other String"

    //Mutable
    var answer: Int = 0
    answer = 42
    println(answer)

    //Numbers
    val myLong: Long = 10L
    val myFloat: Float = 100f
    val myInt: Int = 100

    //Implicit types
    val myLong2 = 10L
    val myFloat2 = 100f
    val myInt2 = 100

    //Ranges
    val range = 1..10
    val range2 = 1..10 step 2
    val range3 = 10 downTo 1

    range.forEach { println(it) }
}