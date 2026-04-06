fun main(){

println("\nEjercicio 8 - App de tareas")

    class Tarea(val descripcion: String) {
        var completada: Boolean = false
    }
val tareas = mutableListOf<Tarea>()

// Agregar tareas
tareas.add(Tarea("Estudiar Kotlin"))
tareas.add(Tarea("Hacer ejercicio"))

// Mostrar tareas
println("Lista de tareas:")
tareas.forEachIndexed { i, tarea ->
    println("$i - ${tarea.descripcion} [${if (tarea.completada) "✔" else "✘"}]")
}

// Marcar como completada
tareas[0].completada = true

println("\nDespués de completar una tarea:")
tareas.forEachIndexed { i, tarea ->
    println("$i - ${tarea.descripcion} [${if (tarea.completada) "✔" else "✘"}]")
}
}
