package kotlinbootcamp.lesson1

fun main(args: Array<String>) {

    // boxing allows primitive types to be stored in objects
    val boxedOne: Number = 1 // avoid boxing for object creation overhead

    val b: Byte = 1
    // val i: Int = b error because implicit type conversion is not allowed
    val i: Int = b.toInt() // use casting instead

    val fish: Int? = null // nullable type

    // Elvis operator ?:
    val value = fish ?: 0 // 0

    val message: String? = null

    // null safety operator
    val capitalisedMessage = message?.capitalize()
    println(capitalisedMessage) // null

    // not null assertion operator is an unsafe operation
    // println(capitalisedMessage!!) // java.lang.NullPointerException

    val fishy = "fish"
    val plant = "fish"

    // == is value comparison
    println(fishy == plant) // true

    // range operators
    val xs = 1..10
    val ys = xs.toList()

    val xss = 10 downTo 2 step 3
    println(xss.toList()) // [10, 7, 4]
}