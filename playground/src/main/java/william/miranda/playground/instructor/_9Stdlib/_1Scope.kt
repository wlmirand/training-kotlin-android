package william.miranda.playground.instructor._9Stdlib

class BigClass {
    lateinit var a1: String
    lateinit var a2: String
    lateinit var a3: String
    lateinit var a4: String
}

fun main() {

    val big1 = BigClass()
    big1.a1 = "A1"
    big1.a2 = "A2"
    big1.a3 = "A3"
    big1.a4 = "A4"

    val big2 = with (BigClass()) {
        a1 = "A1"
        a2 = "A2"
        a3 = "A3"
        a4 = "A4"
        this
    }

    val big3 = BigClass().apply {
        a1 = "A1"
        a2 = "A2"
        a3 = "A3"
        a4 = "A4"
    }

    val big4 = BigClass().let {
        it.a1 = "A1"
        it.a2 = "A2"
        it.a3 = "A3"
        it.a4 = "A4"
        it
    }

    val big5 = BigClass().also {
        it.a1 = "A1"
        it.a2 = "A2"
        it.a3 = "A3"
        it.a4 = "A4"
    }

    println(big4.a2)
}