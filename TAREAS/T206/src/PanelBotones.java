//Clase interna

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelBotones extends JPanel{
    private JButton bn = new JButton("Naranja");
    private JButton ba = new JButton("Azul");
    private JButton bo = new JButton("Negro");

    public PanelBotones() {
        add(bn);
        add(ba);
        add(bo);
        ColorFondo Naranja = new ColorFondo(Color.orange);
        ColorFondo Azul = new ColorFondo(Color.blue);
        ColorFondo Negro = new ColorFondo(Color.black);

        bn.addActionListener(Naranja);
        ba.addActionListener(Azul);
        bo.addActionListener(Negro);
    }

    class ColorFondo implements ActionListener{
        private Color color;
        public ColorFondo(Color c) {
            color=c;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            setBackground(color);
        }
    }
}
