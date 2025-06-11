package sistemainventario;

import sistemainventario.controller.ClienteController;
import sistemainventario.dto.ClienteDTO;
import sistemainventario.views.LoginView;

public class SistemaInventario {

    public static void main(String[] args) {
        LoginView login=new LoginView();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        login.setResizable(false);
        login.setTitle("Sistema de Inventario");
        login.setDefaultCloseOperation(LoginView.EXIT_ON_CLOSE);
    }
    
    private static void pruebaCliente(){
               
        ClienteController clienteController= new ClienteController();
        ClienteDTO dto=clienteController.obtenerCliente(2);
        
        dto.setNombre("Roberto Gonzales");
        dto.setNit("569864");
        dto.setDireccion("Av alamos 231");
        dto.setCelular("7884599");
        dto.setEstado(false);
        
        clienteController.actualizarCliente(dto);
        
        clienteController.listarClientes().forEach(System.out::println);
    }
    
}
