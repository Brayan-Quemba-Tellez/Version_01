fun main(){
println("\nEjercicio 2 - Promedio")

val lista = mutableListOf<Int>()

for (i in 1..5) {
    print("Ingrese número $i: ")
    val n = readLine()!!.toInt()
    lista.add(n)
}

val promedio = lista.average()
println("Promedio = $promedio")}