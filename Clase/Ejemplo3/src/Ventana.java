import javax.swing.*;
import java.awt.*;

// TODO: 11/05/2018 http://www.chuidiang.org/java/layout/GridBagLayout/GridBagLayout.php 

public class Ventana extends JFrame {
        public Ventana(){
                super ("Ejemplo 1");        // El título
                this.getContentPane().setLayout (new GridBagLayout()); // Le ponemos el GridBagLayout...
                JTextArea areaTexto = new JTextArea ("Area texto");
                GridBagConstraints constraints = new GridBagConstraints();
                constraints.gridx = 0; // El área de texto empieza en la columna cero.
                constraints.gridy = 0; // El área de texto empieza en la fila cero
                constraints.gridwidth = 2; // El área de texto ocupa dos columnas.
                constraints.gridheight = 2; // El área de texto ocupa 2 filas.
                this.getContentPane().add (areaTexto, constraints);
        }
}