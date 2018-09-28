import javax.swing.*;
import java.awt.*;


public class MainFrame extends JFrame {

    private TextPanel textPanel;
    private Toolbar barra;
    private FormPanel formPanel;

    public MainFrame() {


        super("Hola buenas tardes");


        setLayout(new BorderLayout());


        textPanel = new TextPanel();
        barra = new Toolbar();
        formPanel = new FormPanel();

        barra.setStringListener(new StringListener() {
            public void textEmitted(String text) {

                textPanel.appendText(text);
            }
        });


        formPanel.setFormListener(new FormListener() {
            @Override
            public void formEventOccurred(FormEvent e) {
                String nombre = e.getNombre();
                String puesto = e.getPuesto();
                int edad = e.getEdadCategoria();
                String empleado = e.getEmpCat();


                textPanel.appendText(nombre + ": " + puesto + ": " + edad + ":" + empleado + " \n");

                System.out.println(e.getGender());

            }


        });


        add(formPanel, BorderLayout.WEST);
        add(barra, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);


        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

}
