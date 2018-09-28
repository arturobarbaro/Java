import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Mirar documentacion

public class MainFrame extends JFrame {
    private JButton btn;
    private TextPanel textPanel;

    public static void main(String[] args) {
        MainFrame m = new MainFrame();
    }

    public MainFrame(){
        super("Hola");

        setLayout(new BorderLayout());

        btn = new JButton("Clickea");
        textPanel = new TextPanel();

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i=0; i<Math.random()*Math.random()/2; i++) {
                    textPanel.appendText("Topo\n");
                    textPanel.appendText("Topo\n");
                }
            }
        });

        add(textPanel, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);

        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}
