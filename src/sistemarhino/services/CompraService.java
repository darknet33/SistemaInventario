package sistemarhino.services;

import java.util.List;
import sistemarhino.dao.CompraDAO;
import sistemarhino.dto.CompraDTO;
import sistemarhino.mappers.CompraMapper;

public class CompraService implements IService<CompraDTO, Integer>{
    private final CompraDAO compraDAO;
    private final CompraMapper compraMapper;

    public CompraService() {
        this.compraDAO=new CompraDAO();
        this.compraMapper=new CompraMapper();
    }

    @Override
    public CompraDTO obtenerPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<CompraDTO> listarTodos() {
        return compraMapper.toDTOList(compraDAO.getAll());
    }

    @Override
    public void guardar(CompraDTO dto) {
        compraDAO.save(compraMapper.toEntity(dto));
    }

    @Override
    public void actualizar(CompraDTO dto) {
        compraDAO.update(compraMapper.toEntity(dto));
    }

    @Override
    public void eliminar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public int idCompra(){
        return compraDAO.obtenerIDUltimaCompra();
    }
    
    
}
