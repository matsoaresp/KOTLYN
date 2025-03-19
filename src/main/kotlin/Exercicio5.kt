package org.example

import java.util.*

fun main() {

    val listaProdutos = listOf(
        Mercado("Arroz, Feijão, Farinha...", "Alimentos", 25.00, 50),
        Mercado("Sabão em pó, Cloro, Sabonete, Detergente...", "Limpeza", 10.50, 30),
        Mercado("Leite, Refrigerante, Suco, Agua...", "Bebidas", 6.99, 100),
        Mercado("Chocolate, Balas...", "Doces", 7.50, 40)
    )
    for (produto in listaProdutos) {
        produto.aplicarDesconto(10.0)
    }
    println("Mercadoria desconto de 10%")
    for (produto in listaProdutos) {
        produto.exibirDetalhes()
    }

}