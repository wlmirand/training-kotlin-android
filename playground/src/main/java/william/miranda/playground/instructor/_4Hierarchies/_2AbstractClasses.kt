package william.miranda.playground.instructor._4Hierarchies


abstract class StoredEntity {
    val isActive = true
    abstract fun store()
    fun status(): String {
        return isActive.toString()
    }

}

class Employee : StoredEntity() {
    //Mandatory to implement all abstract methods
    override fun store() {

    }
}


fun main() {
    val se = Employee()
    se.isActive
    se.status()
}