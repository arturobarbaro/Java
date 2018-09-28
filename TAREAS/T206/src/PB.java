// Clase anonima

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PB extends JPanel{
    private JButton bn = new JButton("Naranja");
    private JButton ba = new JButton("Azul");
    private JButton bo = new JButton("Negro");

    public PB() {
        add(bn);
        add(ba);
        add(bo);
        ActionListener click = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Object BotonPulsado = e.getSource();
                if ( BotonPulsado == bn){
                    setBackground(Color.orange);
                } else if ( BotonPulsado == ba ){
                    setBackground(Color.blue);
                } else {
                    setBackground(Color.black);
                }
            }
        };
        bn.addActionListener(click);
        ba.addActionListener(click);
        bo.addActionListener(click);


    }
}


