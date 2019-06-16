package william.miranda.playground.instructor._8Generics

class MyClass {
    lateinit var prop: String
}

fun <T> T.scopedObject(lambda: (T) -> Unit): T {
    lambda(this)
    return this
}

fun <T> T.scopedReceiver(lambda: T.() -> Unit): T {
    lambda(this)
    return this
}

fun main() {
    val myclass = MyClass().scopedObject {
        it.prop = "MyString"
    }

    println(myclass.prop)

    val myclass2 = MyClass().scopedReceiver {
        prop = "MyString"
    }

    println(myclass2.prop)
}
