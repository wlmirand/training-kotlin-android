package william.miranda.playground.instructor._8Generics

import william.miranda.playground.instructor._Shared.Customer
import william.miranda.playground.instructor._Shared.CustomerRepository

interface Repository<T> {
    fun getById(id: Int): T
    fun getAll(): List<T>
}

fun main() {
    val customerRepo = CustomerRepository<Customer>()

    val customer = customerRepo.getById(10)
    val customers = customerRepo.getAll()
}
