fun main (){
// Lista de números para probar
    val numeros = listOf(2, 4, 6, 8, 10)

// Sumar todos los elementos usando reduce
    val sumaTotal = numeros.reduce { acumulador, valor -> acumulador + valor }

    println("Lista: $numeros")
    println("Suma total: $sumaTotal")}