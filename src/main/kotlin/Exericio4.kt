package org.example

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val n1 = scanner.nextInt()
    val n2 = scanner.nextInt()

    println(Verificação(n1, n2))
}

fun Verificação(num1: Int, num2: Int): Int {

    var resultado = 0;
    if (num1 in 0..9) {
        resultado = num1 * num2;
    } else if (num1 in 10..99) {
        resultado = num1 + num2;
    } else if (num1 in 100..999) {
        resultado = num1 / num2;
    } else if (num1 in 1000..9999) {
        resultado = num1 - num2;
    } else {
        return 0;
    }
    return resultado;
}