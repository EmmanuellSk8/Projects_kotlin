package org.example

fun main() {
    var input = readLine()
    var i = input?.toIntOrNull()
    when (i){
        in 0..17 -> println("menor de edad")
        else -> println("mayor de edad")
    }
}