fun main (){
val lista = listOf(1, 2, 3, 4, 5)


val listaMultiplicada = lista.map { it * 2 }

println("Lista original: $lista")
println("Lista multiplicada por 2: $listaMultiplicada")
}