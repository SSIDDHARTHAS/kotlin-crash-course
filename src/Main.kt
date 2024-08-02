fun main() {
    println(5.isOdd())
}

fun Int.isOdd(): Boolean {
    return this % 2 == 1
}