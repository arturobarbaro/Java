import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private PanelTexto textPanel;
    private JButton btn;
    private Toolbar toolbar;

    public MainFrame() {
        super("T187");

        setLayout(new BorderLayout());

        toolbar = new Toolbar();
        textPanel = new PanelTexto();
        btn = new JButton("Publicidad");

        toolbar.setPanelTexto(textPanel );

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPanel.append("Volvemos en 3 minutos\n");
            }
        });
        //add(toolbar, GridBagConstraints.BASELINE_TRAILING); //Crea el illegalArgument
        add(toolbar, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);
        Toolkit mipantalla = Toolkit.getDefaultToolkit();
        Dimension tamPantalla = mipantalla.getScreenSize();
        int alturaP = tamPantalla.height;
        int anchoP = tamPantalla.width;
        setSize(anchoP/4,alturaP/2);
        setLocation(anchoP/4,alturaP/4);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


}
