package kotlinbootcamp.lesson1

fun main(args: Array<String>) {
    // Lists
    val xs = listOf("a", "b", "c") // immutable List
    val ys = mutableListOf("a", "b") // mutable list

    // Arrays
    val fishes = arrayOf(1, 2, 3)
    val nullabe = arrayOfNulls<Int>(5)

    // arrays can be initialized dynamically
    val array = Array(5) { it * 5 }

    // for loop
    for ((i, e) in array.withIndex()) {
        print("$i -> $e, ")
    } // 0 -> 0, 1 -> 5, 2 -> 10, 3 -> 15, 4 -> 20,


}