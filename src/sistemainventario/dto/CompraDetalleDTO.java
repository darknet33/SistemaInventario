package sistemainventario.dto;


public class CompraDetalleDTO extends DetalleDTO<CompraDTO>{

    @Override
    public int getPK() {
        return id;
    }
    
}
