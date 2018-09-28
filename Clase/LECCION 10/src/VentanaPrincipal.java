import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
    private BarraBotones bb;
    private PanelTexto pt;
    private Formulario f;

    public VentanaPrincipal(String titulo){
        super(titulo);

        setSize(500,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);

        //CRear componentes
        bb= new BarraBotones();
        pt=new PanelTexto();
        f = new Formulario();

        //Defino el panel texto
        bb.setReceptorTexto(new ReceptorTexto() {
            @Override
            public void emitirTexto(String texto) {
                pt.agregarTexto(texto);
            }
        });

        //Añadir componentes
        add(bb, BorderLayout.NORTH);
        add(pt,BorderLayout.CENTER);
        add(f,BorderLayout.WEST);

        setVisible(true);

    }
}
