fun main() {
    val number = readlnOrNull() ?: "0"
    val parsedNumber: Int = try {
        number.toInt()
    } catch (e: Exception){
        0
    }
    println(parsedNumber)
}