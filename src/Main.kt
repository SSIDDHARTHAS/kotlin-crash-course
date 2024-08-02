fun main() {
    val dog = Dog(3)
    dog.introduce()
    dog.bark()
    dog.makeSound()

    val cat = Cat()
    cat.introduce()
    cat.meow()
    cat.makeSound()

//    val animal = Animal("giraffe")
    // not possible since Animal is abstract class

    val bear = object: Animal("Bear"){
        override fun makeSound() {
            println("Growl")
        }
    }
    bear.introduce()
    bear.makeSound()
}