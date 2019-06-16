package william.miranda.playground

abstract class Shape {
    protected abstract val name: String
    abstract fun calculateArea(): Float
}

class Square(private val side: Float): Shape() {
    override val name = "My Square"
    override fun calculateArea() = side * side
}

class Triangle(
    override val name: String,
    private val base: Float,
    private val height: Float
): Shape() {
    override fun calculateArea() = base * height / 2
}

fun main() {
    val square = Square(5f)
    val triangle = Triangle("My Triangle", 3f, 4f)

    println(square.calculateArea())
    println(triangle.calculateArea())
}