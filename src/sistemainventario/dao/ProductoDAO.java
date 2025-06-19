package sistemainventario.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import sistemainventario.entity.Categoria;
import sistemainventario.entity.Producto;
import sistemainventario.entity.Usuario;
import sistemainventario.util.Mensajes;

public class ProductoDAO implements IDAO<Producto, Integer> {

    private final Connection conn;
    private final CategoriaDAO categoriaDAO = new CategoriaDAO();
    private final UsuarioDAO usuarioDAO = new UsuarioDAO();

    public ProductoDAO() {
        this.conn = ConexionDAO.getConexion();
    }

    @Override
    public Producto mapResultSetToEntity(ResultSet rs) throws SQLException {
        Producto entity = new Producto();
        entity.setId(rs.getInt("id_producto"));
        entity.setCodigo(rs.getString("codigo_producto"));
        entity.setDescripcion(rs.getString("descripcion_producto"));
        entity.setMarca(rs.getString("marca_producto"));
        entity.setProcedencia(rs.getString("procedencia_producto"));
        entity.setPeso(rs.getString("peso_producto"));
        entity.setStockInicial(rs.getInt("stock_inicial_producto"));
        entity.setStockActual(rs.getInt("stock_actual_producto"));
        entity.setStockMinimo(rs.getInt("stock_minimo_producto"));
        entity.setFechaRegistro(rs.getTimestamp("f_registro_producto"));
        entity.setFechaActualizado(rs.getTimestamp("f_actualizado_producto"));
        entity.setEstado(rs.getBoolean("estado_producto"));

        Categoria categoria = categoriaDAO.getById(rs.getInt("categoria_id"));
        entity.setCategoria(categoria);

        Usuario usuario = usuarioDAO.getById(rs.getInt("usuario_id"));
        entity.setUsuario(usuario);

        return entity;
    }

    @Override
    public Producto getById(Integer id) {
        String sql = "SELECT * FROM productos WHERE id_producto = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return mapResultSetToEntity(rs);
            }
        } catch (Exception e) {
            Mensajes.error(sql, e);
        }
        return null;
    }

    @Override
    public List<Producto> getAll() {
        List<Producto> lista = new ArrayList<>();
        String sql = "SELECT * FROM productos";

        try (PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                lista.add(mapResultSetToEntity(rs));
            }

        } catch (SQLException e) {
            Mensajes.error(sql, e);
        }

        return lista;
    }

    @Override
    public void save(Producto entity) {
        String sql = "INSERT INTO productos (codigo_producto, categoria_id, descripcion_producto, marca_producto, procedencia_producto, peso_producto, stock_inicial_producto, stock_actual_producto, stock_minimo_producto,estado_producto,usuario_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, entity.getCodigo());
            stmt.setInt(2, entity.getCategoria().getId());
            stmt.setString(3, entity.getDescripcion());
            stmt.setString(4, entity.getMarca());
            stmt.setString(5, entity.getProcedencia());
            stmt.setString(6, entity.getPeso());
            stmt.setInt(7, entity.getStockInicial());
            stmt.setInt(8, entity.getStockActual());
            stmt.setInt(9, entity.getStockMinimo());
            stmt.setBoolean(10, entity.getEstado());
            stmt.setInt(11, entity.getUsuario().getId());
            stmt.executeUpdate();
        } catch (Exception e) {
            Mensajes.error(sql, e);
        }
    }

    @Override
    public void update(Producto entity) {
        String sql = "UPDATE productos SET codigo_producto = ?, categoria_id = ?, descripcion_producto = ?, marca_producto = ?, procedencia_producto = ?, peso_producto = ?, stock_minimo_producto = ?,estado_producto = ?,usuario_id = ? WHERE id_producto = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, entity.getCodigo());
            stmt.setInt(2, entity.getCategoria().getId());
            stmt.setString(3, entity.getDescripcion());
            stmt.setString(4, entity.getMarca());
            stmt.setString(5, entity.getProcedencia());
            stmt.setString(6, entity.getPeso());
            stmt.setInt(7, entity.getStockMinimo());
            stmt.setBoolean(8, entity.getEstado());
            stmt.setInt(9, entity.getUsuario().getId());
            stmt.setInt(10, entity.getId());
            stmt.executeUpdate();
        } catch (Exception e) {
            Mensajes.error(sql, e);
        }
    }

    @Override
    public void delete(Integer id) {
        String sql = "DELETE FROM productos WHERE id_producto = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            Mensajes.error(sql, e);
        }
    }

    public int contarPorCategoria(Integer categoriaId) {
        String sql = "SELECT COUNT(*) FROM productos WHERE categoria_id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, categoriaId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            Mensajes.error(sql, e);
        }
        return 0;
    }

}
