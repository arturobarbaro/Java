import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class PruebaDibujo {
    public static void main(String[] args) {
        MarcoDibujo m = new MarcoDibujo();

    }
}

class MarcoDibujo extends JFrame{
    public MarcoDibujo(){
        setTitle("Prueba ");
        setSize(400,400);
        setDefaultCloseOperation(3);
        setVisible(true);

        LaminaFiguras lf = new LaminaFiguras();
        add(lf);
    }
}

class LaminaFiguras extends JPanel{

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        //g.drawRect(50,50,200,200);
        //g.drawLine(20,10,20,20);
        //g.drawArc(20,10,20,20,300,90);
        Graphics2D g2 = (Graphics2D)g;

        Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
        g2.setPaint(Color.black);

        g2.fill(rectangulo);

        Ellipse2D e = new Ellipse2D.Double();
        e.setFrame(rectangulo);
        g2.setPaint(Color.ORANGE);
        g2.fill(e);

    }

    //Java2D
}
