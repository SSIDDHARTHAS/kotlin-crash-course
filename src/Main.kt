fun main() {
    val shoppingList = mutableListOf("Lamborghini", "Penthouse", "Rolex")
    shoppingList.add("Ferrari")

    println("Printing using while loop")
    var i = 0
    while(i < shoppingList.size){
        println(shoppingList[i])
        i++
    }

    println("Printing using for in List")
    for(item in shoppingList){
        println(item)
    }

    println("Printing using while for in Range")
    for(j in 1..< shoppingList.size){
        println(shoppingList[j])
    }

    println("Printing using forEach")
    shoppingList.forEach{
        println(it)
    }
}