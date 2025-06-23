
package sistemainventario.util;

import java.awt.Color;
import java.awt.Font;

public class UIConstants {
    public static final Color COLOR_PRIMARIO = new Color(1, 15, 21); //(1, 15, 21) (50, 150, 255)
    public static final Color COLOR_SECUNDARIO = new Color(202, 90, 26); //rgb(202, 90, 26) (102, 111, 114) (0, 185, 253)
    public static final Font FONT_MENU = new Font("Arial", Font.PLAIN, 20);
    public static final Font FONT_TITULO = new Font("Segoe UI", Font.BOLD, 28);

    public static final String ICON_BASE_PATH = "/resources/images/menu/";

    public static String getIconPath(String nombre) {
        return ICON_BASE_PATH + nombre + ".png";
    }
}