package william.miranda.playground.instructor._4Hierarchies

import william.miranda.playground.instructor._Shared.Customer

interface CustomerRepository {
    val isEmpty: Boolean
        get() = true

    fun store(obj: Customer) {
        // some concrete implementation
    }

    //This should be implemented by classes
    fun getById(id: Int): Customer
}

