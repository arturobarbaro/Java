package src;

import javax.swing.*;

public class GUI { // Leccion 8. EVITAR ACOPLAMIENTO USANDO INTERFACES
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaPrincipal("A");
            }
        });
    }
}
