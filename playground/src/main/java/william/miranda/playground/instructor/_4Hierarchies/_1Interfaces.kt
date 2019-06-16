package william.miranda.playground.instructor._4Hierarchies

import william.miranda.playground.instructor._Shared.Customer

interface CustomerRepository {
    val isEmpty: Boolean
        get() = true

    fun store(obj: Customer) {
        // implement code to store
    }

    fun getById(id: Int): Customer
}

