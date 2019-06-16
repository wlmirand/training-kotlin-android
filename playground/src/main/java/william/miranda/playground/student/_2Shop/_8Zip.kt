package william.miranda.playground.student._2Shop

fun main() {

    val listOfPairs = "abCDa".zip("79371")

    println(listOfPairs)  // [(a, 7), (b, 9), (C, 3), (D, 7), (a, 1)]
}

// Find the correspondence between customers and their names (as a list or pairs)
fun Shop.zipNameAndCustomer(): List<Pair<String, Customer>> {
    TODO()
}