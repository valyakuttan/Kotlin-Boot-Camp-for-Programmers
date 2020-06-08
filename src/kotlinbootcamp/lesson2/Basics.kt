package kotlinbootcamp.lesson2

import java.util.*


// main function with arguments
fun main(args: Array<String>) {

    // Initialize the list with 10 random Int values
    val xs = List(10) { Random().nextInt(100)}
    println(xs)
}

// functions with default arguments
fun swim(time: Int, pace: String = "fast") {

}



// Compact functions
fun countFish(fishes: List<Int>) = fishes.size