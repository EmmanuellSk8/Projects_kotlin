class moto {
    var color: String = ""
    var modelo = 0
    var marca = ""
    var nombre = ""
    fun prender() {
        println("BRMM BRMM...")
    }
}

fun main() {
    var dr = moto()
    dr.color = "Negro blanco"
    dr.nombre = "F700 gs"
    dr.marca = "Bmw"
    dr.modelo = 2025

    println(dr.nombre)
    println(dr.marca)
    println(dr.modelo)
    println(dr.color)
    println("prendiendo...")
    println(dr.prender())
}