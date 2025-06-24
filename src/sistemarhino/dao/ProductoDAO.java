package sistemarhino.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import sistemarhino.entity.Categoria;
import sistemarhino.entity.Producto;
import sistemarhino.entity.Usuario;

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
        entity.setId(rs.getInt("id"));
        entity.setCodigo(rs.getString("codigo"));
        entity.setDescripcion(rs.getString("descripcion"));
        entity.setMarca(rs.getString("marca"));
        entity.setProcedencia(rs.getString("procedencia"));
        entity.setPeso(rs.getString("peso"));
        entity.setStockInicial(rs.getInt("stock_inicial"));
        entity.setStockActual(rs.getInt("stock_actual"));
        entity.setStockMinimo(rs.getInt("stock_minimo"));
        entity.setFechaRegistro(rs.getTimestamp("fecha_registro"));
        entity.setFechaActualizado(rs.getTimestamp("fecha_actualizado"));
        entity.setEstado(rs.getBoolean("activo"));

        Categoria categoria = categoriaDAO.getById(rs.getInt("categoria_id"));
        entity.setCategoria(categoria);

        Usuario usuario = usuarioDAO.getById(rs.getInt("usuario_id"));
        entity.setUsuario(usuario);

        return entity;
    }

    @Override
    public Producto getById(Integer id) {
        String sql = "SELECT * FROM productos WHERE id = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return mapResultSetToEntity(rs);
            }
        } catch (Exception e) {
            throw new IllegalArgumentException(sql);
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
            throw new IllegalArgumentException(sql);
        }

        return lista;
    }

    @Override
    public void save(Producto entity) {
        String sql = "INSERT INTO productos (codigo, categoria_id, descripcion, marca, procedencia, peso, stock_inicial, stock_actual, stock_minimo,activo,usuario_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
            throw new IllegalArgumentException(sql);
        }
    }

    @Override
    public void update(Producto entity) {
        String sql = "UPDATE productos SET codigo = ?, categoria_id = ?, descripcion = ?, marca = ?, procedencia = ?, peso = ?, stock_minimo = ?,activo = ?,usuario_id = ? WHERE id = ?";
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
            throw new IllegalArgumentException(sql);
        }
    }

    @Override
    public void delete(Integer id) {
        String sql = "DELETE FROM productos WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new IllegalArgumentException(sql);
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
            throw new IllegalArgumentException(sql);
        }
        return 0;
    }

}
