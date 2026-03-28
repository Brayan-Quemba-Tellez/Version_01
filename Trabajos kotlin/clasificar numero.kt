fun main (){
    val numeroClasificar = -11

    val resultado = when {
        numeroClasificar > 0 -> "Positivo"
        numeroClasificar < 0 -> "Negativo"
        else -> "Cero"
    }

    println("El número es: $resultado")
}