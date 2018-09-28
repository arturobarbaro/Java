import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VentanaPrincipal extends JFrame{
    List<Carta> c = new ArrayList<Carta>();


    public VentanaPrincipal() {
        super("Juego de parejas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        GridLayout grid = new GridLayout(4,4);
        setLayout(grid);
        for (int i = 0; i < c.size; i++) {
            c.add(new Carta(1));
            c.add(new Carta(2));
            c.add(new Carta(3));
            c.add(new Carta(4));
        }
        Collections.shuffle(c);
        for (int i = 0; i < c.size(); i++) {
            c.toString();
        }
        pack();
        setVisible(true);
    }
}
