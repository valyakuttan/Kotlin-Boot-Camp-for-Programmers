package kotlinbootcamp.lesson2

fun main(args: Array<String>) {

    // repeat function
    repeat(4) {
        println("hello")
    }

    // filter on list is eager
    val xs = (1..10).toList().filter { it % 2 == 1 } // [1, 3, 5, 7, 9]

    // if you want lazy behaviour use sequence
    val ys = (1..10).asSequence().filter { it % 2 == 1 }

    // apply map lazly
    val lazyMap = (1..3).asSequence().map{
        print("map: $it ")
        it
    }
    println(lazyMap) // will not print elements
    println("first: ${lazyMap.first()}") // map: 1 first: 1
    println("all: ${lazyMap.toList()}") // map: 1 map: 2 map: 3 all: [1, 2, 3]
}