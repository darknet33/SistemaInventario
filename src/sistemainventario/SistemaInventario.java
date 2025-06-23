package sistemainventario;

import sistemainventario.util.Texto;
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
    
    private static void test(){
        System.out.println(Texto.isDecimal("300"));
        System.out.println(Texto.isDecimal("324.23"));
        System.out.println(Texto.isDecimal(""));
    }
    
}
