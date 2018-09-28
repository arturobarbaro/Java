import javax.swing.*;
import java.awt.*;

public class Ejemplo2 {
    public static void main(String[] args) {
        MarcoCentrado mc = new MarcoCentrado();
    }
}

class MarcoCentrado extends JFrame{
    public MarcoCentrado(){
        Toolkit mipantalla = Toolkit.getDefaultToolkit();
        Dimension tamPantalla = mipantalla.getScreenSize();

        setTitle("Marco centrado");

        int alturaP = tamPantalla.height;
        int anchoP = tamPantalla.width;
        // Crear un marco a partir de estas dimensiones
        setSize(anchoP/2,alturaP/2);
        setLocation(anchoP/4,alturaP/4);
        Image miIcono = mipantalla.getImage("icono.png");
        setIconImage(miIcono);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
