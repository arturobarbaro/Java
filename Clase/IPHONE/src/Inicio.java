import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Inicio extends JPanel {
    //private VentanaPrincipal ventanaPrincipal ;

    public Inicio() {
        setSize(100,200);
        Boton llamadas = new Boton("Llamadas");
        Boton contactos = new Boton("Contactos");
        setLayout(new GridLayout(1,5));
        llamadas.setBackground(Color.GREEN);
        contactos.setBackground(Color.CYAN);
        add(llamadas);
        llamadas.addActionListener(new MiReceptor());
        add(contactos);
        add(new Boton("Menu"));
        add(new Boton("Mensajes"));
        add(new Boton("WhatsApp"));

    }
    private class MiReceptor implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton)e.getSource();
            JFrame j = new JFrame(b.getText());
            setSize(300,300);
            j.setVisible(true);
        }
    }


}
