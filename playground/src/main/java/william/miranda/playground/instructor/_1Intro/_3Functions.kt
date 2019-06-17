package william.miranda.playground.instructor._1Intro

/*
int sum(int a, int b, int c) {
    return a + b + c;
}
*/

fun sum(a: Int, b: Int, c: Int): Int {
    return a + b + c
}

fun sum2(a: Int, b: Int, c: Int) = a + b + c

fun sum3(a: Int, b: Int, c: Int = 0) = a + b + c

// vararg
fun printMany(vararg elements: Int) {
    for (element in elements) {
        println(element)
    }
}

fun main() {
    sum(1, 2, 3)
    sum2(1, 2, 3)

    // named arguments
    sum(c = 5, a = 7, b = 2)

    printMany(1, 2, 3, 4, 5)
}


