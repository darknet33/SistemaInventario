
package sistemarhino.services;

import java.util.List;
import sistemarhino.dao.ClienteDAO;
import sistemarhino.dto.ClienteDTO;
import sistemarhino.mappers.ClienteMapper;
import sistemarhino.validator.ClienteValidator;

public class ClienteService implements IService<ClienteDTO, Integer>{
    private final ClienteDAO clienteDAO;
    private final ClienteMapper clienteMapper;

    public ClienteService() {
        this.clienteDAO = new ClienteDAO();
        this.clienteMapper = new ClienteMapper();
    }    
    
    @Override
    public ClienteDTO obtenerPorId(Integer id) {
        return clienteMapper.toDTO(clienteDAO.getById(id));
    }

    @Override
    public List<ClienteDTO> listarTodos() {
        return clienteMapper.toDTOList(clienteDAO.getAll());
    }

    @Override
    public void guardar(ClienteDTO dto) {
        ClienteValidator.validar(dto);
        clienteDAO.save(clienteMapper.toEntity(dto));
    }

    @Override
    public void actualizar(ClienteDTO dto) {
        ClienteValidator.validar(dto);
        clienteDAO.update(clienteMapper.toEntity(dto));
    }

    @Override
    public void eliminar(Integer id) {
        clienteDAO.delete(id);
    }
    
}
