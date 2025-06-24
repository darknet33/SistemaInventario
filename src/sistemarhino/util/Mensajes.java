package sistemarhino.util;

import javax.swing.JOptionPane;

public class Mensajes {

    private static final String TITULO = "Mensaje Importante - ";

    // Mostrar un mensaje de error con detalles
    public static void error(String mensaje, Exception ex) {
        String detalles = ex.getMessage() + "\n";

        JOptionPane.showMessageDialog(
                null,
                mensaje + detalles,
                TITULO + "Error",
                JOptionPane.ERROR_MESSAGE
        );
    }
    
    public static void errorValidaciones(Exception ex) {
        String detalles = ex.getMessage() + "\n";

        JOptionPane.showMessageDialog(
                null,
                detalles,
                TITULO + "Validaciones",
                JOptionPane.WARNING_MESSAGE
        );
    }

    // Mostrar mensaje informativo
    public static void info(String mensaje) {
        JOptionPane.showMessageDialog(
                null,
                mensaje,
                TITULO + "Información",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    // Mostrar advertencia
    public static void advertencia(String mensaje) {
        JOptionPane.showMessageDialog(
                null,
                mensaje,
                TITULO + "Advertencia",
                JOptionPane.WARNING_MESSAGE
        );
    }

    // Mostrar confirmación (Sí/No)
    public static int confirmar(String mensaje) {
        return JOptionPane.showConfirmDialog(
                null,
                mensaje,
                TITULO + "Confirmación",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );
    }
}