fun main() {
    println(isEven(num = 10))
    println(isEven(num = 13, msg = "Hey There"))
}

fun isEven(msg: String = "", num: Int): Boolean {
    if(msg.isNotEmpty()) println(msg)
    return num % 2 == 0
}