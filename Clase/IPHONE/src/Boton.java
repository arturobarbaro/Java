import javax.swing.*;
import java.awt.*;

public class Boton extends JButton {
    public Boton(String text) {
        super(text);
        setPreferredSize(new Dimension(20,20));
        setFont(Font.decode(text));
    }
}
