class Vendas {
    fun pedidoSimples(pedido: List<String>): Double {
        val maçaPrecoUnitario = 0.60
        val laranjaPrecoUnitario = 0.25

        val maças = pedido.count { it.toLowerCase() == "maçã" }
        val laranjas = pedido.count { it.toLowerCase() == "laranja" }

        // Oferta "Compre um e ganhe outro grátis nas maçãs"
        val maçasComDesconto = maças / 2 + maças % 2

        // Oferta "3 pelo preço de 2 em laranjas"
        val laranjasComDesconto = (laranjas / 3) * 2 + laranjas % 3

        val valorTotal = (maçasComDesconto * maçaPrecoUnitario) + (laranjasComDesconto * laranjaPrecoUnitario)
        return valorTotal
    }
}