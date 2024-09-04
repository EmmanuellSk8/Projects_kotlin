fun main() {
    while (true) {
        println("Seleccione una operación:")
        println("1. Sumar")
        println("2. Restar")
        println("3. Multiplicar")
        println("4. Dividir")
        println("5. Salir")

        println("Ingrese el número correspondiente a la operación a realizar: ")
        val opcion = readLine()?.toIntOrNull()

        if (opcion == 5)
            println("Saliendo...")
        break

    }
    println("Ingrese el primer número: ")
    val num1 = readLine()?.toIntOrNull()
    println("Ingrese el segundo número: ")
    val num2 = readLine()?.toIntOrNull()

}