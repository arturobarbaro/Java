import javax.swing.*;
import java.awt.*;

public class Casilla extends JButton {
    private Color colorFondo;
    private char letra;
    private boolean click;

    /**
     * Constructor de Casilla
     * Asigna un tamaño a los componentes e inicializa por defecto sus atributos.
     */
    public Casilla() {
        setPreferredSize(new Dimension(10,10));
        setClick(false);
        setBackground(Color.CYAN);
    }

    /**
     * Setter
     * @param click
     *       Para conocer si la casilla seleccionada a editar
     */
    public void setClick(boolean click) {
        this.click = click;
        setColorFondo(Color.GREEN);
    }

    /**
     * Setter
     * @param colorFondo
     *        Color de fondo a asignar a una casilla
     */
    public void setColorFondo(Color colorFondo) {
        this.colorFondo = colorFondo;
        setBackground(colorFondo);
    }

    /**
     * Setter
     * @param letra
     *        Letra a asignar a una casilla
     */
    public void setLetra(String letra) {
        this.letra = letra.charAt(0);
        setText(letra);
    }
}
