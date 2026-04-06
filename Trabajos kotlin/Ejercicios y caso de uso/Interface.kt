fun main () {
    println("\nEjercicio 6 - Interfaces")

    val calc = Calculadora()
    println("Suma: ${calc.sumar(10, 5)}")
    println("Resta: ${calc.restar(10, 5)}")
}


interface Operaciones {
    fun sumar(a: Int, b: Int): Int
    fun restar(a: Int, b: Int): Int
}

class Calculadora : Operaciones {
    override fun sumar(a: Int, b: Int): Int {
        return a + b
    }

    override fun restar(a: Int, b: Int): Int {
        return a - b
    }
}