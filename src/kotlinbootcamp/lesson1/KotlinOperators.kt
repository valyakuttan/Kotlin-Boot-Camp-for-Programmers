package kotlinbootcamp.lesson1

fun main(args: Array<String>) {
    val fish: Int? = null // nullable type

    // Elvis operator ?:
    val value = fish ?: 0 // 0

    val message: String? = null

    // null safety operator
    val capitalisedMessage = message?.capitalize()
    println(capitalisedMessage) // null

    // unsafe operation
    println(capitalisedMessage!!) // java.lang.NullPointerException

}