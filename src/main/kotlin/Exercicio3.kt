package org.example
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var valorA: Int = scanner.nextInt()
    var valorB: Int = scanner.nextInt()

    println(calculo(valorA, valorB))

}
fun calculo(a: Int, b: Int): Int {
    var resultado = 0
    if (a % 2 == 0 && b % 2 == 0) {
        resultado = a + b;
    } else if (a % 2 != 0 && b % 2 != 0) {
        resultado = a * b;
    } else {
        return 0
    }
    return resultado
}