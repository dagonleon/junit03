import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {

    @Test
    void testPrecioTotal() {
        Producto p = new Producto("pan",0.50f, 2);
        assertEquals(1f, p.precioTotal(), 0.1);
    }

    @Test
    void getNombre() {
        Producto p = new Producto("pan",0.50f, 1);

        assertEquals("pan", p.getNombre());
    }

    @Test
    void getPrecio() {
        Producto p = new Producto("pan",0.50f, 1);

        assertEquals(0.5f, p.getPrecio(), 0.1);
    }
    @Test
    void getCamtidad() {
        Producto p = new Producto("pan",0.50f, 3);

        assertEquals(3, p.getCantidad(), 0.1);
    }
}