fun main () {
    val operacionCombinada = { a: Int, b: Int, c: Int -> (a + b) * c }
    println("Operación combinada: ${operacionCombinada(3, 4, 5)}")
}