import javax.swing.*;
import java.awt.*;

public class MarcoBotones extends JFrame {
    private PB pb;

    public MarcoBotones() throws HeadlessException {
        setTitle("Tarea 206");
        pb = new PB();
        add(pb);
        setSize(400,400);
        setDefaultCloseOperation(3);
        setVisible(true);
    }
}
