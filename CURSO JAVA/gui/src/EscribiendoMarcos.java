import  javax.swing.*;
import java.awt.*;

public class EscribiendoMarcos {
    public static void main(String[] args) {

        MarcoConTexto mc = new MarcoConTexto();

    }
}

class MarcoConTexto extends  JFrame{
    private Lamina lamina;

    public MarcoConTexto(){
        setSize(600,450);
        setLocation(400,200);
        setTitle("Primer texto");
        setVisible(true);

        Lamina lamina = new Lamina();
        add(lamina);
        setDefaultCloseOperation(3);

    }
}

class Lamina extends  JPanel{
    public Lamina() {
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("Mucho Beti",100,100);
    }
}