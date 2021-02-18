package intruduction

open class Dog {                // 1
    open val hoge: String = "aa"
    val foo = null
    open fun sayHello() {       // 2
        println("wow wow!")
    }
}

class Yorkshire : Dog() {       // 3
    override val hoge: String = "bb"
    override fun sayHello() {   // 4
        println("wif wif!")
    }
}

fun main() {
    val dog: Dog = Yorkshire()
    dog.sayHello()

    val parent_dog: Dog = Dog()
    parent_dog.sayHello()
}

