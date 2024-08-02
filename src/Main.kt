fun main() {
    val marks = ((Math.random() * 100) + 1).toInt()
    when(marks){
        in 60..< 80 -> println("C")
        85 -> println("S")
        in 80..< 90 -> println("B")
        in 90 .. 100 -> println("A")
        else -> {
            println("Congratulations, You played yourself")
        }
    }
}