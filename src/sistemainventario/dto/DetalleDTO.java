
package sistemainventario.dto;

public abstract class DetalleDTO<T> {
    protected int id;
    protected T movimiento;
    protected ProductoDTO product;
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

    public ProductoDTO getProduct() {
        return product;
    }

    public void setProduct(ProductoDTO product) {
        this.product = product;
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
