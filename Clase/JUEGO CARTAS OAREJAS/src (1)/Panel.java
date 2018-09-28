import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    private JTextArea at;
    public Panel(){
        at = new JTextArea();
        setLayout(new GridLayout());
        Dimension dim = getPreferredSize();
        dim.width = 250;
        setPreferredSize(dim);

        add(new JScrollPane(at), GridLayout.class);
    }

    public void agregarTexto(String texto){
        at.append(texto);
    }
}
