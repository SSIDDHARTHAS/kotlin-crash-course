abstract class Animal(
    protected val name: String,
    protected var legsCount: Int = 4
) {

    init {
        println("New animal named $name created")
    }

    fun introduce() {
        println("Hello, my name is $name")
    }

    abstract fun makeSound()
}