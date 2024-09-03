import com.sun.tools.javac.Main
import kotlin.math.sqrt

class triangulo(val lado1: Double, val lado2: Double, val lado3: Double) {

    fun calPerimetro(): Double {
        return lado1 + lado2 + lado3
    }

    fun calcularArea(): Double {
        val semiPerimetro = calPerimetro() / 2
        return (
            semiPerimetro
                    * (semiPerimetro - lado1)
                    * (semiPerimetro - lado2)
                    * (semiPerimetro - lado3)
        )
    }
}

fun main() {
    val triangulo = triangulo(4.0, 6.0, 6.0)

    val perimetro = triangulo.calPerimetro()
    println("El perímetro es: $perimetro")

    val area = triangulo.calcularArea()
    println("El área es: $area")
}


