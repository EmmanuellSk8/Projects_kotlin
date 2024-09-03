import java.time.LocalDate

fun main() {

    print("Ingrese su año de nacimiento: ")
    val input = readLine()
    val añoNacimiento = input?.toIntOrNull()

    if (añoNacimiento != null){
        val añoActual = LocalDate.now().year

        val edad = añoActual - añoNacimiento

        println("Tu edad es: $edad años")
    }
    else{
        println("La fecha dada no es válida, favor corríjala e inténtelo de nuevo.")
    }
}