fun main() {

    val mensaje = saludo("Brayan", 20)


    println("$mensaje")
}


fun saludo(nombre: String, edad: Int): String {
    return "Hola, $nombre. Tienes $edad años."

}