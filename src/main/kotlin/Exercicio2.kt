package org.example

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    var n = 5;

        var exibirValores = "";
        for (i in 1..n) {
            var valor = scanner.nextInt()

            if (valor % 2 != 0) {
                exibirValores += valor.toString()+" "
            }
        }
        println(exibirValores)
}
