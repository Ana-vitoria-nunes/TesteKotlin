fun main() {
    val vendas=Vendas()
    val pedido1= listOf("Maçã", "Maçã", "Maçã", "Maçã")
    val pedido2= listOf("Laranja", "Laranja", "Laranja", "Laranja", "Laranja", "Laranja")
    val pedido3 = listOf("Maçã", "Maçã", "Laranja", "Maçã")
    println(vendas.pedidoSimples(pedido1))
    println(vendas.pedidoSimples(pedido2))
    println(vendas.pedidoSimples(pedido3))

}