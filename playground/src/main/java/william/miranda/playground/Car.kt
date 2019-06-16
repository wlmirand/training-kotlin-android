package william.miranda.playground

class Car constructor(
    val brand: String,
    val model: String,
    val year: Int,
    val doors: Int
) {

    init {
        println("First init block")
    }

    private val number = 7

    init {
        println("Second init block: $number")
    }
}

fun main() {
    Car("Seat", "Ibiza", 2000, 4)
}