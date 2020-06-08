package kotlinbootcamp.lesson1

fun main(args: Array<String>) {
    val fish = 5

    // if statements
    if (fish in 1..10) {
        println("ok")
    } else {
        println("not ok")
    }

    // when statement
    when (fish) {
        in 1..5 -> println("ok")
        else -> println("not ok")
    }

    when (fish) {
        1, 3 -> println("Odd")
        else -> println("even")
    }

    when {
        fish % 2 == 1 -> println("odd")
        else -> println("even")
    }

    // In Kotlin if and when are expressions
    val result = if (fish > 5) 10 else 0

    val total = when {
        fish > 5 -> 10
        else -> 0
    }
}