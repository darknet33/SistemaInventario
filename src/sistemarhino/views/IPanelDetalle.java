
package sistemarhino.views;

import sistemarhino.dto.ProductoDTO;

public interface IPanelDetalle<E> {
    E existeDetalle(ProductoDTO producto);
    boolean agregarDetalle(E detalle);
    String cantidadNew(String cantidadOlD,int IncDec);
    boolean quitarDetalle(E detalle);
    String[] getColumnDetails();
    Object[] toRowDetails(E e);
    void cargarDetails();
    void ControlsetDTODetails(E detalle);
}
