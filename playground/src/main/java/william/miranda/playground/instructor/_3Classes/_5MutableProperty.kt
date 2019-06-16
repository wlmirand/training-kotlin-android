package william.miranda.playground.instructor._3Classes

class LengthCounter {
    var counter: Int = 0
        private set

    fun addWord(word: String) {
        counter += word.length
    }
}

class StateLogger {
    var state = false
        set(value) {
            println("state has changed")
            field = value
        }
}

fun main() {
    val lengthCounter = LengthCounter()
    lengthCounter.addWord("Hi!")
    println(lengthCounter.counter)

    StateLogger().state = true
}
