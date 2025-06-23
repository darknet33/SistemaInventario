package sistemainventario;

import sistemainventario.util.Texto;
import sistemainventario.views.LoginView;

public class SistemaInventario {

    public static void main(String[] args) {
        LoginView login=new LoginView();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        login.setResizable(false);
        login.setTitle("Sistema RHINO 1.0");
        login.setDefaultCloseOperation(LoginView.EXIT_ON_CLOSE);
    }

}
