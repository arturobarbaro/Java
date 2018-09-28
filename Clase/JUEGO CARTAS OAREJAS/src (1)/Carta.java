import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Carta extends JButton {
    private static final long serialVersionUID = 1L;
    private static final int TAMANO = 103; // Tamano de los botones
    private int tipo, identificador;
    Border borde;

    public Carta() {
        setPreferredSize(new Dimension(TAMANO,TAMANO));
        setFocusPainted(false);
        borde = new LineBorder(new Color(228,223,208), 6);
        setBorder(borde);
    }
}
