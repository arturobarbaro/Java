import javax.swing.*;
import java.awt.*;

public class Carta extends JButton {
    private int num;
    public Carta(int num) {
        setPreferredSize(new Dimension(600, 600));
        this.num = num;
    }


    @Override
    public String toString() {
        return "numero" + num;
    }
}
