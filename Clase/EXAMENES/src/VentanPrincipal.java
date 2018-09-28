import javax.swing.*;
import java.awt.*;

public class VentanPrincipal extends JFrame {
    private Tablero tablero;

    public VentanPrincipal(String titulo) {
        super(titulo);
        tablero = new Tablero();
        add(tablero, BorderLayout.CENTER);
        setSize(800,600);
        setLocation(200,150);
        //pack();
        setVisible(true);
        setDefaultCloseOperation(3);
    }
}

/**
public class VentanaPrincipal extends JFrame {
    private Marco marco;

    public VentanaPrincipal(String nombre, int numero) {
        super(nombre);
        setLayout(new BorderLayout());

        marco = new Marco(numero);

        add(marco, BorderLayout.CENTER);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(400, 400));
        setPreferredSize(new Dimension(500, 500));
        setLocationRelativeTo(null);
        pack();
        setVisible(true);
    }
} **/
