fun main() {
    val list = listOf("Kotlin" , "is", "fun")
    val count = list.customCount(check = { s ->
        s.length == 3
    }, "Hello")
    println(count)
}

fun List<String>.customCount(check: (String) -> Boolean, msg: String): Int{
    println(msg)
    var count = 0
    for(item in this){
        if(check(item)){
            count++
        }
    }
    return count
}