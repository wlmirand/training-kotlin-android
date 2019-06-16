package william.miranda.playground.instructor._4Hierarchies


open class Person() {
    open fun validate() {

    }
}

open class OpenCustomer() : Person() {
    final override fun validate() {

    }
}

class SpecialCustomer : OpenCustomer() {

}

data class CustomerEntity(val name: String) : Person()

fun main() {

    val customer = OpenCustomer()

    customer.validate()
}