import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

public class Pantalla extends JPanel {
    public Pantalla() {
        setLayout(new GridLayout(5,4,5,5));
        add(new Boton("Twitter"), BorderLayout.LINE_START);
        add(new Boton("YouTube"), BorderLayout.LINE_START);
        add(new Boton("Trello"), BorderLayout.LINE_START);
        add(new Boton("Chrome"), BorderLayout.LINE_START);
        add(new Boton("GPS"), BorderLayout.LINE_START);
        add(new Boton("Claculadora"));
        add(new Boton("Skype"));
    }

    private class MiReceptor implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton)e.getSource();
            System.out.println("Hola");
        }
    }
}
