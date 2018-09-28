// Leccion 10
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Formulario extends JPanel {
    private JLabel nombre;
    private JLabel puesto;
    private JTextField campoNombre;
    private JTextField campoPuesto;
    private JButton botonAceptar;

    public Formulario(){
        Dimension dim = getPreferredSize();
        dim.width = 250;
        setPreferredSize(dim);

        nombre = new JLabel("Nombre: ");
        puesto = new JLabel("Puesto: ");
        campoNombre = new JTextField(10);
        campoPuesto = new JTextField(10);
        botonAceptar = new JButton("Aceptar");
        Border interno = BorderFactory.createTitledBorder("Añadir persona");
        Border externo = BorderFactory.createEmptyBorder(5,5,5,5); //Crtol+p
        setBorder(BorderFactory.createCompoundBorder(externo,interno)); //Ctrl + q (documentacion)

    }
}
