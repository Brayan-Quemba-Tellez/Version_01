fun main () {
    val numeros = listOf(3, 8, 5, 10, 7)
    val pares = numeros.filter { it % 2 == 0 }
    println("Números pares: $pares")
}