import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    private JPanel p1;
    private JPanel p2;
    private JButton b1;


    public VentanaPrincipal() {
        super("Ventana Principal");

        b1 = new JButton("WEST");
        p1 = new JPanel();
        p2 = new JPanel();

        p1.setLayout(new BorderLayout());
        p2.setLayout(new BorderLayout());
        p1.add(b1, BorderLayout.CENTER);
        add(p1, BorderLayout.WEST);
        add(p2, BorderLayout.EAST);

        b1.addActionListener(e -> {
            if (b1.getText().equals("EAST")) {
                p1.add(b1);
                b1.setText("WEST");
            } else {
                p2.add(b1);
                b1.setText("EAST");
            }
        });

        // Base JFrame
        Dimension d = new Dimension(300, 300);
        setPreferredSize(d);
        setLocationRelativeTo(null);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
