import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Toolbar extends JPanel implements ActionListener {
    private JButton jButton;
    private JButton jButton1;
    private PanelTexto panelTexto;


    public Toolbar() {
        jButton = new JButton("Clickea");
        jButton1 = new JButton("Pulsame y apruebas");


        setLayout(new FlowLayout(FlowLayout.LEFT));


        jButton.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton) e.getSource();
                panelTexto.append(b.getText() + "\n");
            }
        });

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    JButton b = (JButton) e.getSource();
                } catch (ClassCastException CCE){
                    System.err.println("Error ......");
                }
                panelTexto.append("Era broma\n");
            }
        });
        jButton.setBackground(Color.orange);
        add(jButton);
        add(jButton1);
    }

    public void setPanelTexto(PanelTexto panelTexto) {
        this.panelTexto = panelTexto;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton pulsar = (JButton) e.getSource();

        if (pulsar == jButton) {
            panelTexto.append("Tocame\n");
        } else if (pulsar == jButton1) {
            panelTexto.append(("Era broma"));
        }
    }
}