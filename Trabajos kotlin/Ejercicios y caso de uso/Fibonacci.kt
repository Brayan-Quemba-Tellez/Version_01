fun main () {
    println("\nEjercicio 3 - Fibonacci")

    var a = 0
    var b = 1

    for (i in 1..20) {
        print("$a ")
        val temp = a + b
        a = b
        b = temp
    }
}