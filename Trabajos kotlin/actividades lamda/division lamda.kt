fun main(){

val division = { a: Int, b: Int ->
    if (b != 0) a / b
    else {
        println("Error: no se puede dividir por cero")
        0
    }
}
println("División: ${division(10, 0)}")}
