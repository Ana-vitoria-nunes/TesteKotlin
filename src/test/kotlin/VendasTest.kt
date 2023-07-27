
import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class VendasTest {
//    @Test
//    fun testConcluirPedido_NotificacaoEnviada() {
//        val produtos = listOf("Maçã", "Maçã", "Laranja", "Maçã")
//        val pedido = Vendas()
//
//        val expectedNotification = "Notificação: Seu pedido está Concluído. Tempo estimado de entrega: 30 minutos. Valor Total: 1.45"
//        assertEquals(expectedNotification,pedido.concluirPedido(produtos))
//    }
    @Test
    fun testConcluirPedido_NotificacaoEnviada1() {
        val produtos = listOf("Maçã", "Maçã", "Laranja", "Maçã")

        // Redireciona a saída padrão para um ByteArrayOutputStream para capturar a notificação
        val outContent = ByteArrayOutputStream()
        System.setOut(PrintStream(outContent))

        val pedido = Vendas()
        val status = "Entregue"
        val tempoEstimadoEntrega = "45 minutos"
        val notificacao = pedido.concluirPedido(produtos, status, tempoEstimadoEntrega)

        // Restaura a saída padrão
        System.setOut(System.out)

        val expectedNotification = "Notificação: Seu pedido está Entregue. Tempo estimado de entrega: 45 minutos. Valor Total: 1.45"
        assertEquals(expectedNotification, notificacao)
    }

}