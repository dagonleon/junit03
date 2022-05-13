import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacturaTest {

    @Test
    void testTotalFatura() {
        Factura f = new Factura();
        Producto p1 =  new Producto("pan",0.50f, 2);
        Producto p2 = new Producto("jamon",3.50f, 4);
        f.meterProducto(p1);
        f.meterProducto(p2);
        assertEquals(8f, f.totalFatura(), 0.1);
    }

    @Test
    void testAplicarIva() {
        Factura f = new Factura();
        Producto p1 =  new Producto("pan",0.50f, 2);
        Producto p2 = new Producto("jamon",3.50f, 4);
        f.meterProducto(p1);
        f.meterProducto(p2);
        assertEquals(9.68f, f.aplicarIva(21), 0.1);
    }
}