
package sistemainventario.dto;

public abstract class DetalleDTO<T> implements IDTO {
    protected int id;
    protected T movimiento;
    protected ProductoDTO producto;
    protected int cantidad;
    protected double precio;

    public DetalleDTO() {
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

    public ProductoDTO getProducto() {
        return producto;
    }

    public void setProducto(ProductoDTO producto) {
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

    @Override
    public String toString() {
        return producto + " cantidad=" + cantidad + " precio=" + precio;
    }
    
    
}
