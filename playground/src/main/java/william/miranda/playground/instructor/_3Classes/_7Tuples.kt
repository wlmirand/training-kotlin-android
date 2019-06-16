package william.miranda.playground.instructor._3Classes


fun main() {

    val countryAndCity = Pair("Spain", "Madrid")

    println("${countryAndCity.first}, ${countryAndCity.second}")

    val countryAndCityAndContinent = Triple("Spain", "Madrid", "Europe")
    println("${countryAndCityAndContinent.first}, ${countryAndCityAndContinent.second}, ${countryAndCityAndContinent.third}")
}