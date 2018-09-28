import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class Tablero extends JPanel {
    private ArrayList<Boton> botones = new ArrayList<>();
    private BotonVacio bv = new BotonVacio();

    public Tablero() {
        add(bv);

        inicializar();
        setLayout(new GridLayout(4,4));

        setVisible(true);
        //setSize(800,600);
    }

    private void inicializar() {
        for (int i = 1; i < 16; i++) {
            Boton b = new Boton(i + " ");
            b.addActionListener(new MiReceptor());
            botones.add(b);
        }
        Collections.shuffle(botones);
        for (int i = 0; i < botones.size(); i++) {
            add(botones.get(i));
        }
    }


    public void mover(JButton b) {
        for (int i = 0; i < 16 ; i++) {
            if (getComponent(i) == b) {
                if (i != 0) {
                    if (getComponent(i - 1) == bv) {
                        add(b, i - 1);
                        add(bv, i);
                        b.repaint();
                        bv.repaint();
                        b.revalidate();
                        bv.revalidate();
                        repaint();
                        revalidate();
                        break;
                    }
                }
                if (i < 4*4-4) {
                    if (getComponent(i + 4) == bv) {
                        add(b, i + 4);
                        add(bv, i);
                        b.repaint();
                        bv.repaint();
                        b.revalidate();
                        bv.revalidate();
                        repaint();
                        revalidate();
                        break;
                    }
                }
                if (i > 4) {
                    if (getComponent(i - 4) == bv) {
                        add(b, i - 4);
                        add(bv, i);
                        b.repaint();
                        bv.repaint();
                        b.revalidate();
                        bv.revalidate();
                        repaint();
                        revalidate();
                        break;
                    }
                }
                if (getComponent(i + 1) == bv) {
                    add(b, i + 1);
                    add(bv, i);
                    b.repaint();
                    bv.repaint();
                    repaint();
                    revalidate();
                    break;
                }
            }
        }
    }

    private class MiReceptor implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Aa");
            JButton b = (JButton) e.getSource();
            mover(b);
        }
    }
}
/**
import javax.swing.*;
        import java.awt.*;
        import java.awt.event.MouseAdapter;
        import java.awt.event.MouseEvent;
        import java.util.ArrayList;
        import java.util.Collections;

public class Marco extends JPanel {
    private ArrayList<JButton> botones;
    private JButton blanca;
    private int tamaño;


    public Marco(int n) {
        if (n < 4)
            throw new IllegalArgumentException("Error: El tablero debe tener un tamaño minimo de 4");

        tamaño = n;

        setLayout(new GridLayout(tamaño, tamaño));
        setPreferredSize(new Dimension(tamaño * 100, tamaño * 100));

        botones = new ArrayList<>();

        for (Integer i = 1; i < n * n; i++) {
            Boton b = new Boton(i);
            b.addMouseListener(new MiReceptor());
            botones.add(b);
        }

        Collections.shuffle(botones);

        for (int i = 0; i < n * n - 1; i++) {
            add(botones.get(i));
        }

        blanca = new JButton();
        blanca.setBackground(Color.WHITE);
        add(blanca);
    }

    public void mover(JButton b) {
        for (int i = 0; i < tamaño * tamaño - 1; i++) {
            if (getComponent(i) == b) {
                if (getComponent(i + 1) == blanca) {
                    add(b, i + 1);
                    add(blanca, i);
                    b.repaint();
                    blanca.repaint();
                    repaint();
                    revalidate();
                    break;
                }
                if (i != 0) {
                    if (getComponent(i - 1) == blanca) {
                        add(b, i - 1);
                        add(blanca, i);
                        b.repaint();
                        blanca.repaint();
                        b.revalidate();
                        blanca.revalidate();
                        repaint();
                        revalidate();
                        break;
                    }
                }
                if (i < tamaño * tamaño - tamaño) {
                    if (getComponent(i + tamaño) == blanca) {
                        add(b, i + tamaño);
                        add(blanca, i);
                        b.repaint();
                        blanca.repaint();
                        b.revalidate();
                        blanca.revalidate();
                        repaint();
                        revalidate();
                        break;
                    }
                }
                if (i > tamaño) {
                    if (getComponent(i - tamaño) == blanca) {
                        add(b, i - tamaño);
                        add(blanca, i);
                        b.repaint();
                        blanca.repaint();
                        b.revalidate();
                        blanca.revalidate();
                        repaint();
                        revalidate();
                        break;
                    }
                }
            }
        }
    }

    private class MiReceptor extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            JButton button = (JButton) e.getSource();
            mover(button);
        }
    }
}

**/