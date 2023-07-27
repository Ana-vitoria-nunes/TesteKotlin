fun main(args: Array<String>) {
    val vendas = Vendas()
    val pedido = listOf("maçã", "maçã", "laranja", "maçã")

    println(vendas.concluirPedido(pedido,"Entregue","45 minutos"))

}