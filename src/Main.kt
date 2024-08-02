fun main() {
    greet("Sid")
    greet()
}

fun greet(name: String = ""){
    println("Hello $name")
}