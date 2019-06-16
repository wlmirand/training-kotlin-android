package william.miranda.playground.instructor._6Extensions

//Simple extension function
fun Int.factorial(): Int {
    var result = 1
    for (i in 2..this) {
        result *= i
    }

    return result
}

//Custom operator overload
data class Fraction(val numerator: Int, val denominator: Int) {

    operator fun plus(fraction: Fraction): Fraction {
        val finalDenominator = this.denominator * fraction.denominator

        val numerator1 = finalDenominator / this.denominator * this.numerator
        val numerator2 = finalDenominator / fraction.denominator * fraction.numerator

        return Fraction(numerator1 + numerator2, finalDenominator)
    }

    infix fun cross(fraction: Fraction) = this.numerator * fraction.denominator + this.denominator * fraction.numerator
}


fun main() {
    println(5.factorial())

    val number = 6
    println(number.factorial())

    val f1 = Fraction(3,5)
    val f2 = Fraction(4,7)

    println(f1 + f2)
    println(f1 cross f2)
}