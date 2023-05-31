import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {
    float valor = 1200.0f;
    @Test
    void deveCalcularParcela1xCliente() {
        Cliente cliente = new Cliente();
        cliente.calcularParcela1x(valor);
        assertEquals(1200.0f, cliente.getValorCompra());
    }

    @Test
    void deveCalcularParcela2xCliente() {
        Cliente cliente = new Cliente();
        cliente.calcularParcela2x(valor);
        assertEquals(612.0f, cliente.getValorCompra());
    }
    @Test
    void deveCalcularParcela3xCliente() {
        Cliente cliente = new Cliente();
        cliente.calcularParcela3x(valor);
        assertEquals(416.0f, cliente.getValorCompra());
    }
    @Test
    void deveCalcularParcela4xCliente() {
        Cliente cliente = new Cliente();
        cliente.calcularParcela4x(valor);
        assertEquals(324.0f, cliente.getValorCompra());
    }
    @Test
    void deveCalcularParcela5xCliente() {
        Cliente cliente = new Cliente();
        cliente.calcularParcela5x(valor);
        assertEquals(264.0f, cliente.getValorCompra());
    }
    @Test
    void deveCalcularParcela6xCliente() {
        Cliente cliente = new Cliente();
        cliente.calcularParcela6x(valor);
        assertEquals(224.0f, cliente.getValorCompra());
    }
}
