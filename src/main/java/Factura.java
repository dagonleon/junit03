import java.util.ArrayList;

public class Factura {
    ArrayList<Producto> productos = new ArrayList();
    public void meterProducto(Producto p){
        productos.add(p);
    }
    public float totalFatura(){
        float total = 0;
        for (Producto p:productos) {
            total += p.precioTotal();
        }
        return total;
    }
    public float aplicarIva(float iva){
        return (totalFatura()*iva)/100 + totalFatura();
    }
}
