import javax.swing.*;
import java.awt.*;

public class Ejemplo1 {

    public static void main(String[] args) {

        MiMarco m1 = new MiMarco();

    }
}

class MiMarco extends JFrame{
    public MiMarco(){
        setSize(500,300);
        setTitle("Ventana MiMarco");
        setLocation(500,300);
        //setBounds(500,300,250,250);
        //setResizable(false);  //impedir que se pueda redimensionar
        //setExtendedState(Frame.MAXIMIZED_BOTH); //El marco se abre a pamtalla completa
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
