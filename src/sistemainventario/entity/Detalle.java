
package sistemainventario.entity;

public abstract class Detalle<T> {
    protected int id;
    protected T movimiento;
    protected Producto producto;
    protected int cantidad;
    protected double precio;

    public Detalle() {
    }

    public Detalle(int id, T movimiento, Producto producto, int cantidad, double precio) {
        this.id = id;
        this.movimiento = movimiento;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public T getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(T movimiento) {
        this.movimiento = movimiento;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
