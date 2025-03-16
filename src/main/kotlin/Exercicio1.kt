package org.example
import java.util.Scanner
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val scanner = Scanner(System.`in`)

    var n = 10;

    var exibirValores = "";
    for (i in 1..n) {
        var valor = scanner.nextInt()
        exibirValores += valor.toString()+" "

    }
    println(exibirValores)



}