package william.miranda.playground.instructor._5Nullability

fun main() {

    //Always valid String
    val s1: String = "always not null"

    //This can be null
    var s2: String? = "nullable string"

    //Length
    val len1 = s1.length

    val len2 = s2?.length //note this can be NULL

    val len3 = s2?.length ?: 0
}