package kotlinbootcamp.lesson2

var dirty = 0

fun feedFish(dirty: Int) = dirty + 10

// Function Types and Lambdas
val waterFilter: (Int) -> Int = {dirty -> dirty / 2}

// Higher Order Functions
fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    operation(dirty)

    return dirty
}

fun dirtyProcessor() {
    dirty = updateDirty(
        dirty,
        waterFilter
    )

    // passing a named function requires ::, to indicate that
    // we are passing a reference
    dirty = updateDirty(
        dirty,
        ::feedFish
    )

    // Last parameter call syntax, the last parameter can be passed
    // inside a curly braces
    dirty =
        updateDirty(dirty) { ditry ->
            dirty * 2
        }
}