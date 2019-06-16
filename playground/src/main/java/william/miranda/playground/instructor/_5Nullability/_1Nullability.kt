package william.miranda.playground.instructor._5Nullability

fun main() {

    //Always valid String
    val s1: String = "always not null"

    //This can be null
    val s2: String? = "nullable string"

    //Length
    val len1: Int = s1.length
    val len2: Int? = s2?.length //note this can be NULL

    val len3: Int = s2?.length ?: 0//if s2 is null, we get a default
}