fun main () {
    println("\n\nEjercicio 4 - Clase Persona")

    open class Persona(val nombre: String, val edad: Int) {
        open fun mostrar() {
            println("Nombre: $nombre, Edad: $edad")
        }
    }

    val persona = Persona("Brayan", 20)
    persona.mostrar()
    // Herencia
    println("\nEjercicio 5 - Herencia")
    class Estudiante(nombre: String, edad: Int, val nota: Double) : Persona(nombre, edad) {
        override fun mostrar() {
            println("Nombre: $nombre, Edad: $edad, Nota: $nota")
        }
    }

    val estudiante = Estudiante("Brayan", 20, 4.5)
    estudiante.mostrar()
}