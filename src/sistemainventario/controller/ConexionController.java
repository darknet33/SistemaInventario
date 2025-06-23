package sistemainventario.controller;

import javax.swing.JLabel;
import sistemainventario.services.ConexionService;
import sistemainventario.util.Mensajes;

public class ConexionController {

    private final ConexionService conexionService;

    public ConexionController() {
        this.conexionService = new ConexionService();
    }

    public void verificarConexionDB(JLabel estado) {
        estado.setVisible(true);
        estado.setText("Iniciando Prueba de Conexion a DB...");
        conexionService.verificarConexionAsync(conectado -> {
            if (conectado) {
                estado.setText("Prueba de Conexion Exitosa");
                estado.setVisible(false);
            } else {
                estado.setText("Comuniquese con el Servicio Tecnico de la Aplicacion");
            }
        });
    }

    public void cerrarConexion() {
        conexionService.cerrarConexion();
    }
}
