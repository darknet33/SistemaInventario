package sistemainventario.services;

import java.util.List;
import sistemainventario.dao.VentaDAO;
import sistemainventario.dto.VentaDTO;
import sistemainventario.mappers.VentaMapper;

public class VentaService implements IService<VentaDTO, Integer>{
    private final VentaDAO ventaDAO;
    private final VentaMapper ventaMapper;

    public VentaService() {
        this.ventaDAO=new VentaDAO();
        this.ventaMapper=new VentaMapper();
    }

    @Override
    public VentaDTO obtenerPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<VentaDTO> listarTodos() {
        return ventaMapper.toDTOList(ventaDAO.getAll());
    }

    @Override
    public void guardar(VentaDTO dto) {
        ventaDAO.save(ventaMapper.toEntity(dto));
    }

    @Override
    public void actualizar(VentaDTO dto) {
        ventaDAO.update(ventaMapper.toEntity(dto));
    }

    @Override
    public void eliminar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public int idVenta(){
        return ventaDAO.obtenerID();
    }
    
    
}
