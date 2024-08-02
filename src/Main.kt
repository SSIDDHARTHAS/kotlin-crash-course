fun main() {
    val number1 = readlnOrNull() ?: "0"
    val number2 = readlnOrNull()
    val result = number1.toInt() + number2!!.toInt()
    println(result)
}