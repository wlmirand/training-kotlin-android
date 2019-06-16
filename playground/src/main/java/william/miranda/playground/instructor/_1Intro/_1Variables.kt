package william.miranda.playground.instructor._1Intro

fun main() {
    // read-only
    val question: String =
            "life, the universe, " +
                    "and everything"
    println("$question?")

    // mutable
    var answer = 0
    answer = 42
    println(answer)

//    answer = "no answer"

    // val is read-only reference, not object
    val languages = mutableListOf("Java")
    languages.add("Kotlin")
}