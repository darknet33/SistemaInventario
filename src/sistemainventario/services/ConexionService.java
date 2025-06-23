package sistemainventario.services;

import javax.swing.SwingUtilities;
import sistemainventario.dao.ConexionDAO;
import sistemainventario.util.ConexionCallback;


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
