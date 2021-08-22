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

//    val number1 = readLine() ?: "0"
//    val number2 = readLine() ?: "0"
//    val result = number1.toInt() + number2.toInt()
//    println(result)

//    val shoppingList = listOf<String>("Lamb", "Toilet Paper", "Cereal")
//    println(shoppingList[0])
    //two types of lists in kotlin - mutable and immutable lists
    //we can't change items in an immutable list
//    val cocktailList = mutableListOf("Basil", "Tomato/Grapefruit", "Summer Cup")
//    cocktailList.add("Strawberry")
    //while loop & for loop in kotlin

//    var counter = 0
//    while(counter < cocktailList.size) {
//        println(cocktailList[counter])
//        counter++
//    }
//    cocktailList.add("Passionfruit Martini")
//
//    for(cocktail in cocktailList) {
//        println(cocktail)
//    }

//    for (i in 1..100) {
//        println(i)
//    }
//    val xPrime = 3
//    when(xPrime) {
//        in 1..2 -> println("x is between 1 and 2")
//        in 3..10 -> println("x is between 3 and 10")
//        else -> {
//            println("x isn't in the range of 1 to 10")
//        }
//    }
//    val xPrime = isEven(5)
//    println(xPrime)
//    val yPrime = 3
//    println(yPrime.isOdd())

    val dog = Animal("Margie")
}

fun print10Numbers() {
    for(i in 1..10) {
        println(i)
    }
}

fun isEven(number: Int = 10): Boolean { //this is a default param in case we don't pass anything
    return number % 2 == 0
}

fun Int.isOdd(): Boolean { //extension function
    return this % 2 == 1
}