fun main ()
{
    val paisesCapitales: Map<String, String> = mapOf(
        "Alemania" to "Berlin",
        "Noruega" to "Oslo",
        "Suecia" to "Estocolmo",
        "Chile" to "Santiago",
        "México" to "Ciudad de México"
    )



    for ((pais, capital) in paisesCapitales) {
        println("$pais -> $capital")
    }
}