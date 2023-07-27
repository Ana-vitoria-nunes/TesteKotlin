class Vendas {
    fun concluirPedido(produtos: List<String>,status: String, tempoEstimadoEntrega: String): String {
        val precoMaça = 0.60
        val precoLaranja = 0.25
        var totalMaça = 0
        var totalLaranja = 0

        for (produto in produtos) {
            if (produto.equals("Maçã", ignoreCase = true)) {
                totalMaça++
            } else if (produto.equals("Laranja", ignoreCase = true)) {
                totalLaranja++
            }
        }

        val valorTotalMaça = (totalMaça / 2 + totalMaça % 2) * precoMaça

        val valorTotalLaranja = ((totalLaranja / 3) * 2 + totalLaranja % 3) * precoLaranja

        val valorTotal = valorTotalMaça + valorTotalLaranja

        return "Notificação: Seu pedido está $status. Tempo estimado de entrega: $tempoEstimadoEntrega. Valor Total: $valorTotal"
    }

    var estoqueMaça = 3
    var estoqueLaranja = 2
    fun processarPedido(pedidos: List<String>):String {

        val maçasPedidas = pedidos.count { it.equals("maçã", ignoreCase = true) }
        val laranjasPedidas = pedidos.count { it.equals("laranja", ignoreCase = true) }

        if (maçasPedidas > estoqueMaça || laranjasPedidas > estoqueLaranja) {
            return "Desculpe, não temos estoque suficiente para atender ao seu pedido."

        }
        estoqueMaça -= maçasPedidas
        estoqueLaranja -= laranjasPedidas
        val statusPedido = "Concluído"
        val tempoEstimadoEntrega = "30 minutos"

        return  concluirPedido(pedidos,statusPedido,tempoEstimadoEntrega)

    }
}