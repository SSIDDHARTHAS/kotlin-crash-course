fun checker(x:Int) {
    if(x == 2){
        println("x is 2")
    } else if(x == 3){
        println("x is 3")
    } else {
        println("x is not 2 or 3")
    }
}
fun main() {
    checker(1+1)
    checker(100)
    val x = (Math.random() * 10).toInt()
    val parity = if(x % 2 == 0) "even" else "odd"
    println("$x is $parity number")
}