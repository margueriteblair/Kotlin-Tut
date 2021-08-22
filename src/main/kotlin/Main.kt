fun main() {
    val x = 3f / 4f
    println("The value of x is $x")
    val amIanAdult = true
    val amIaProgrammer = true
    val amIanAdultProgrammer = amIanAdult && amIaProgrammer
    println(amIanAdultProgrammer)

    val str = "Kotlin is the best language!"
    println(str.toUpperCase())

    val y = 1+1
    if (y == 2) {
        println("y is 2")
    } else if (y == 3) {
        println("y is 3")
    } else {
        println("y isn't 2 or 3")
    }

    val z: Int? = null
    val number1 = readLine()
    val number2 = readLine()
    val result = number1!!.toInt() + number2!!.toInt()

}