package org.example

class Mercado(
    val nome: String,
    val categoria: String,
    var preco: Double,
    var quantidade: Int
) {
    fun aplicarDesconto(porcentagem: Double) {
        val desconto = preco * (porcentagem / 100)
        preco -= desconto
    }
    fun exibirDetalhes() {
        println("Produto: $nome")
        println("Categoria: $categoria")
        println("Preço: R$ %.2f".format(preco))
        println("Quantidade em estoque: $quantidade")
        println("-------")
    }
}