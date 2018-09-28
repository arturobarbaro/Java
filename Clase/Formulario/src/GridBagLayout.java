import javax.swing.*;
import java.awt.*;

public class GridBagLayout extends JFrame{
    public GridBagLayout() {
        createView();

        setDefaultCloseOperation(3);
        setSize(400,200);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void createView() {
        JPanel panelMain = new JPanel();
        getContentPane().add(panelMain);

        JPanel panelForm = new JPanel(new java.awt.GridBagLayout());
        panelMain.add(panelForm);

        GridBagConstraints c = new GridBagConstraints();
        c.gridx=0;
        c.gridy=0;

        panelForm.add(new JLabel("Nombre: "), c);
        c.gridy ++;
        panelForm.add(new JLabel("Apellidos: "), c);
        c.gridy ++;
        panelForm.add(new JLabel("Email: "), c);
        c.gridy ++;
        panelForm.add(new JLabel("Usuario: "), c);
        c.gridy ++;
        panelForm.add(new JLabel("Password: "), c);

        c.gridx = 1;
        panelForm.add(new JTextField(8),c);
    }

    public static void main(String[] args) {
        //GridBagLayout c = new GridBagLayout();
        SwingUtilities.invokeLater(()(new GridBagLayout().setVisible(true)));
    }
}
