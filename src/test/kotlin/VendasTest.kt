
import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals

class VendasTest {

    @Test
    fun testProcessarPedido_EstoqueSuficiente() {
        val pedidos = listOf("maçã", "maçã", "laranja")

        val pedido = Vendas()
        val notificacao = pedido.processarPedido(pedidos)

        val expectedNotification = "Notificação: Seu pedido está Concluído. Tempo estimado de entrega: 30 minutos. Valor Total: 0.85"
        assertEquals(expectedNotification, notificacao)
    }

    @Test
    fun testProcessarPedido_EstoqueInsuficiente() {
        val pedidos = listOf("maçã", "maçã", "maçã", "maçã", "laranja", "laranja")

        val pedido = Vendas()
        val notificacao = pedido.processarPedido(pedidos)

        val expectedNotification = "Desculpe, não temos estoque suficiente para atender ao seu pedido."
        assertEquals(expectedNotification, notificacao)
    }
}