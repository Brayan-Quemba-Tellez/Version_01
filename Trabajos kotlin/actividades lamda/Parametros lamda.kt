fun main (){


    fun calcular(a: Int, b: Int, operacion: (Int, Int) -> Int): Int {
        return operacion(a, b)
    }



        // Pedir datos al usuario
    print("Ingrese el primer número: ")
    val num1 = readLine()!!.toInt()

    print("Ingrese el segundo número: ")
    val num2 = readLine()!!.toInt()

        // Usando la función con suma
    val suma = calcular(num1, num2) { x, y -> x + y }
    println("Suma: $suma")

        // Usando la función con multiplicación
    val multiplicacion = calcular(num1, num2) { x, y -> x * y }
    println("Multiplicación: $multiplicacion")}

