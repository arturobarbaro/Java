import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
    private Tablero tablero;
   private BarraEstado barra;

    /**
     *
     * @param titulo
     *          Titulo de VentanaPincipal.
     * @throws NullPointerException
     *          Si el titulo es nulo.
     * @throws  HeadlessException
     */
    public VentanaPrincipal(String titulo) throws HeadlessException {
        super(titulo);
        if (titulo==null)
            throw new NullPointerException("El titulo no puede ser nulo");
        tablero = new Tablero(5);
        add(tablero);
        barra=new BarraEstado();
        barra.setEditarCasilla((casilla, letra, c) -> {
            casilla.setLetra(letra);
            casilla.setColorFondo(c);
        });
        add(barra,BorderLayout.SOUTH);
        setPreferredSize(new Dimension(400,400));
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
