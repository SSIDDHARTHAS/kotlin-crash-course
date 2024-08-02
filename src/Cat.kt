class Cat : Animal("Cat") {

    init {
        println("$name has $legsCount legs")
    }

    fun meow() {
        println("meow meow")
    }

    override fun makeSound(){
        meow()
    }
}