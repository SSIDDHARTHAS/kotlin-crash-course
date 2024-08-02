class Dog(
    legsCount: Int?
) : Animal("Dog"){

    init {
        println("$name has $legsCount legs")
    }

    fun bark(){
        println("Woof Woof!")
    }

    override fun makeSound(){
        bark()
    }
}