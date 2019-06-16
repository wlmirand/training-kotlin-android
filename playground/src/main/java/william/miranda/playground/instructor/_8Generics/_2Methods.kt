package william.miranda.playground.instructor._8Generics

fun <T> head(list: List<T>): T {
    return when (list.count()) {
        0 -> throw IllegalArgumentException("Cannot ask for head on empty list")
        else -> list.first()
    }
}

fun main() {
    val intList = listOf(2,4,6,8,10)
    val strList = listOf("a", "b", "c", "d", "e")

    println(head(intList))
    println(head(strList))
}

