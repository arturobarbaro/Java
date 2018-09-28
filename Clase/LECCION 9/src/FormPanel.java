import javax.swing.*;
import java.awt.*;

public class FormPanel extends JPanel{
    public FormPanel() {
        Dimension d = getPreferredSize();
        d.width = 250;
        setPreferredSize(d);
    }
}
