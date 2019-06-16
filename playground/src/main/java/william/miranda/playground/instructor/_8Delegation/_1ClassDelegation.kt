package william.miranda.playground.instructor._8Delegation

import william.miranda.playground.instructor._Shared.Customer

interface Repository {
    fun getById(id: Int): Customer
    fun getAll(): List<Customer>
}

interface Logger {
    fun logAll()
}

class Controller(repository: Repository, logger: Logger) : Repository by repository, Logger by logger {


}