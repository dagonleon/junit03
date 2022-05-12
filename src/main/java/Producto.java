public class Producto {
    String nombre;
    float precio;
    int cantidad;

    public Producto(String nombre, float precio, int cantidad){
        this.nombre=nombre;
        this.precio=precio;
        this.cantidad=cantidad;
    }
    public float precioTotal(){
        return precio*cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
}
