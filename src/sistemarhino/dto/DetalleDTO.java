
package sistemarhino.dto;

import java.util.Objects;

public abstract class DetalleDTO implements IDTO {
    protected int id;
    protected int idMovimiento;
    protected ProductoDTO producto;
    protected String cantidad;
    protected String precio;

    public DetalleDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(int idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public ProductoDTO getProducto() {
        return producto;
    }

    public void setProducto(ProductoDTO producto) {
        this.producto = producto;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    public double getImporte(){
        return Double.parseDouble(this.precio) * Integer.parseInt(this.cantidad);

    }

    @Override
    public String toString() {
        return producto + " cantidad=" + cantidad + " precio=" + precio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.producto);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DetalleDTO other = (DetalleDTO) obj;
        return Objects.equals(this.producto, other.producto);
    }
    
    
}
