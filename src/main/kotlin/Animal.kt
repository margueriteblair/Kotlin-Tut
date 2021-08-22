class Animal(
    val name: String

) {
    init {
        //init block is the block of code that will be executed whenenver we make a new instance :)
        println("Hello, my name is $name")
    }
}