fun main() {
    val vendas=Vendas()
    val pedido= listOf("maçã", "maçã", "maçã", "maçã", "laranja", "laranja")
    println(vendas.processarPedido(pedido))
}