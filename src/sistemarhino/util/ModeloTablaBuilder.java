package sistemarhino.util;

import java.util.List;
import java.util.function.Function;
import javax.swing.table.DefaultTableModel;

public class ModeloTablaBuilder<T> {

    /**
     * Crea un DefaultTableModel no editable a partir de una lista y un mapper.
     *
     * @param columnas Nombre de las columnas
     * @param datos Lista de objetos (por ejemplo, DTOs)
     * @param mapeador Función que convierte un objeto en una fila (Object[])
     * @return DefaultTableModel listo para usar
     */
    public DefaultTableModel construirModelo(String[] columnas, List<T> datos, Function<T, Object[]> mapeador) {
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // todas las celdas no editables
            }
        };
        if(datos!=null){
        datos.stream()
             .map(mapeador)
             .forEach(modelo::addRow);
        }

        return modelo;
    }
}
