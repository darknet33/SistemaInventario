/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sistemainventario.dao;

import java.util.List;
import java.sql.*;

public interface IDAO<T, ID> {
    T mapResultSetToEntity(ResultSet rs) throws SQLException;
    T getById(ID id);
    List<T> getAll();
    void save(T entity);
    void update(T entity);
    void delete(ID id);
}
