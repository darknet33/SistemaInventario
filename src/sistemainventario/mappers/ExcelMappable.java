
package sistemainventario.mappers;

import java.util.List;

public interface ExcelMappable<T> {
    String[] getHeaders();
    List<String> mapToRow(T data);
    T mapFromRow(List<String> rowValues);
}
