package william.miranda.playground.instructor._1Intro


fun foo(fooParam: String) {

    val outerFunction = "Value"
    fun bar(barParam: String) {

        println(barParam)
        println(fooParam)
        println(outerFunction)
    }


}

fun main() {

    foo("Some value")


}
