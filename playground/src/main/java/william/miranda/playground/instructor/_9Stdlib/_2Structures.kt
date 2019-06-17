package william.miranda.playground.instructor._9Stdlib

import william.miranda.playground.instructor._Shared.albums

fun main() {
    val l1 = listOf(1,2,3,4,5,6,7,8,9,10)
    val l2 = mutableListOf<Int>()

    val s1 = setOf<Int>()
    val s2 = mutableSetOf<Int>()

    val m1 = mapOf<Int, String>()
    val m2 = mutableMapOf<Int, String>()

    //println(l1.first())
    //println(l1.last())

    //l1.forEach { println(it) }

    albums.sortedByDescending { it.title }.forEach { println(it) }
}
