package sistemainventario.util;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Imagen extends JLabel {

    private String ruta = "";

    @Override
    protected void paintComponent(Graphics gg) {
        Graphics g = (Graphics2D) gg;
        URL rutaAbsoluta = getClass().getResource(ruta);
        if (rutaAbsoluta != null) {
            ImageIcon imagen = new ImageIcon(rutaAbsoluta);
            g.drawImage(imagen.getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
        } else {
            System.err.println("No se encontró la imagen en la ruta: " + ruta);
        }

    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

}
