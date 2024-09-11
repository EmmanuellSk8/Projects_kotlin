package org.example

fun main() {
    var input = readLine()
    var i = input?.toIntOrNull();

    if (i != null) {
        if (i <= 17){
            println("Menor de edad")
        } else if(i >= 18){
            println("mayor de edad")
        }
    }

}

