/*We recommend using with for calling functions on the context object
when you don't need to use the returned result. In code, with can be read as "with this object, do the following."*/

fun main() {
    val numbers = mutableListOf("one", "two", "three")
    with(numbers) {
        println("'with' is called with argument $this")
        println("It contains $size elements")
    }
}