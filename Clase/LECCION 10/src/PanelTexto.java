import javax.swing.*;
import java.awt.*;

public class PanelTexto extends JPanel {
    private JTextArea at;
    public PanelTexto(){
        at = new JTextArea();
        setLayout(new BorderLayout());

        add(new JScrollPane(at), BorderLayout.CENTER);
    }

    public void agregarTexto(String texto){
        at.append(texto);
    }
}
