import javax.swing.*;

//añade bordes
//en la leccion 12 coloca los botones

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
