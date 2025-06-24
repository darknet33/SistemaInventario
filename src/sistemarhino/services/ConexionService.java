package sistemarhino.services;

import javax.swing.SwingUtilities;
import sistemarhino.dao.ConexionDAO;
import sistemarhino.util.ConexionCallback;


public class ConexionService {
    public void cerrarConexion(){
        ConexionDAO.closeConexion();
    }
    
    public void verificarConexionAsync(ConexionCallback callback) {
        new Thread(() -> {
            boolean exito = ConexionDAO.probarConexion();
            SwingUtilities.invokeLater(() -> callback.resultado(exito));
        }).start();
    }
}
