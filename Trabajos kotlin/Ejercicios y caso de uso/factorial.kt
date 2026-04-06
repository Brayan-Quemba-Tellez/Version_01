import kotlin.math.*


fun main() {

    println("Ejercicio 1 - Factorial")
    print("Ingrese un número: ")
    val num = readLine()!!.toInt()
    fun factorial(n: Int): Int {
        var resultado = 1
        for (i in 1..n) {
            resultado *= i
        }
        return resultado
    }
    println("Factorial de $num = ${factorial(num)}")}