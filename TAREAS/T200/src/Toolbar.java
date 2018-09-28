import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Toolbar extends JPanel implements ActionListener {
    private JButton botonhola;
    private JButton botonadios;

    private StringListener textListener;

    public Toolbar() {
        setBorder(BorderFactory.createEtchedBorder());

        botonhola = new JButton("Hola");
        botonadios = new JButton("Adios");


        botonhola.addActionListener(this);
        botonadios.addActionListener(this);
        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(botonhola);
        add(botonadios);
    }


    public void setStringListener(StringListener listener) {

        this.textListener = listener;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton pulsado = (JButton) e.getSource();
        if (pulsado == botonhola) {
            if (textListener != null) {
                textListener.textEmitted("Hola\n");
            }

        } else if (pulsado == botonadios) {
            if (textListener != null) {
                textListener.textEmitted("Adios\n");
            }

        }
    }
}

