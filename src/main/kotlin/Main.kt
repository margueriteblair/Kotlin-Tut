fun main() {
    val x = 3f / 4f
    println("The value of x is $x")
    val amIanAdult = true
    val amIaProgrammer = true
    val amIanAdultProgrammer = amIanAdult && amIaProgrammer
    println(amIanAdultProgrammer)

    val str = "Kotlin is the best language!"
    println(str.toUpperCase())

//    val y = 1+1
//    if (y == 2) {
//        println("y is 2")
//    } else if (y == 3) {
//        println("y is 3")
//    } else {
//        println("y isn't 2 or 3")
//    }

    val number1 = readLine() ?: "0"
    val number2 = readLine() ?: "0"
    val result = number1.toInt() + number2.toInt()
    println(result)

    val shoppingList = listOf<String>("Lamb", "Toilet Paper", "Cereal")
    println(shoppingList[0])
    //two types of lists in kotlin - mutable and immutable lists
    //we can't change items in an immutable list
    val shoppingList2 = mutableListOf("Basil", "Tomato/Grapefruit", "Summer Cup")
    shoppingList2.add("Strawberry")
    //while loop & for loop in kotlin

    var counter = 0
    while(counter < shoppingList2.size) {
        println(shoppingList2[counter])
        counter++
    }

}