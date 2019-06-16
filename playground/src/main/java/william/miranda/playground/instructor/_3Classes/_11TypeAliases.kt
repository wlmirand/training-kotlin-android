package william.miranda.playground.instructor._3Classes


typealias CustomerName = String


// Example of using typealias for rename with @Deprecated


class BaseCustomer // before was called BasicCustomer

@Deprecated("BasicCustomer is now called BaseCustomer", replaceWith = ReplaceWith("BaseCustomer"))
typealias BasicCustomer = BaseCustomer




fun main() {


    val customer = BasicCustomer()

}