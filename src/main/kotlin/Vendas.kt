class Vendas {

    fun concluirPedido(produtos: List<String>, status: String, tempoEstimadoEntrega: String): String {
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

        // Aplica a oferta de "Compre um e ganhe outro grátis na maçãs"
        val valorTotalMaça = (totalMaça / 2 + totalMaça % 2) * precoMaça

        // Aplica a oferta de "3 pelo preço de 2 em laranjas"
        val valorTotalLaranja = ((totalLaranja / 3) * 2 + totalLaranja % 3) * precoLaranja

        val valorTotal = valorTotalMaça + valorTotalLaranja

        // Simula o envio da notificação ao client
        return "Notificação: Seu pedido está $status. Tempo estimado de entrega: $tempoEstimadoEntrega. Valor Total: $valorTotal"
    }
}
