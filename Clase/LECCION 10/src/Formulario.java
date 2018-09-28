// Leccion 10
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Formulario extends JPanel {
    public Formulario(){
        Dimension dim = getPreferredSize();
        dim.width = 250;
        setPreferredSize(dim);

        Border interno = BorderFactory.createTitledBorder("Añadir persona");
        Border externo = BorderFactory.createEmptyBorder(5,5,5,5); //Crtol+p
        setBorder(BorderFactory.createCompoundBorder(externo,interno)); //Ctrl + q (documentacion)

    }
}
