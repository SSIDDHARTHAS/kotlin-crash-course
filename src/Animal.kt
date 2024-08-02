abstract class Animal(
    protected val name: String,
    protected var legsCount: Int = 4
) {

    init {
        println("New animal created")
    }

    fun introduce() {
        println("Hello, my name is $name")
    }

    abstract fun makeSound()
}