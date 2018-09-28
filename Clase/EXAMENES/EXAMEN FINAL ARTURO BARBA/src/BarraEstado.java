import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BarraEstado extends JPanel {
    private JLabel letra;
    private JTextField campoLetra;
    private JLabel color;
    private JComboBox listaColor;
    private JButton aceptar;
    private EditarCasilla editarCasilla;

    /**
     * Constructor BarraEstado.
     * No recibe parametros.
     */
    public BarraEstado() {
        letra=new JLabel("Letra");
        add(letra);
        campoLetra=new JTextField(2);
        add(campoLetra);
        color=new JLabel("Color");
        add(color);
        listaColor=new JComboBox();
        listaColor.addItem("AMARILLO");
        listaColor.addItem("AZUL");
        listaColor.addItem("BLANCO");
        listaColor.addItem("NEGRO");
        listaColor.addItem("ROJO");
        listaColor.addItem("VERDE");
        listaColor.setActionCommand("Amarillo");
        add(listaColor);
        aceptar=new JButton("Aceptar");
        MiReceptor miReceptor = new MiReceptor();
        aceptar.addActionListener(miReceptor);
        add(aceptar);

    }

    /**
     * Setter editarCasilla
     * @param editarCasilla
     *                Objeto editar casilla a asignar para evitar acoplamiento.
     * @throws NullPointerException
     *                Si no hay asignado un objeto que implemente EditarCasilla
     */
    public void setEditarCasilla(EditarCasilla editarCasilla) {
        if (editarCasilla==null){
            throw new NullPointerException("No hay objeto asignado que implemente EditarCasilla");
        }
        this.editarCasilla = editarCasilla;
    }

    private class MiReceptor implements ActionListener{
        /**
         * @param e Evento
         * @throws NullPointerException
         *           En el caso de no haber una letra asignada
         * @throws IllegalStateException
         *           En el caso de que exista mas de una letra asignada
         * @throws RuntimeException
         *           Si no se cumplen los casos de clase.
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            if (campoLetra.getText() == null)
                throw new IllegalStateException("No hay una letra asignada");
            if (campoLetra.getText().length() > 1)
                throw new IllegalStateException("Debe haber una unica letra asignada");
            Casilla c = (Casilla)e.getSource();
            switch (listaColor.getActionCommand()){

                case "Amarillo":
                    editarCasilla.editarCasilla(c,campoLetra.getText(), Color.YELLOW);
                    break;
                case "Azul":
                    editarCasilla.editarCasilla(c,campoLetra.getText(), Color.BLUE);
                    break;
                case "Negro":
                    editarCasilla.editarCasilla(c,campoLetra.getText(), Color.BLACK);
                    break;
                case "Rojo":
                    editarCasilla.editarCasilla(c,campoLetra.getText(), Color.RED);
                    break;
                case "Verde":
                    editarCasilla.editarCasilla(c,campoLetra.getText(), Color.GREEN);
                    break;
                default:
                    throw new RuntimeException("Comando de accion desconocido");

            }

            editarCasilla.editarCasilla(c,campoLetra.getText(), Color.YELLOW);
        }


    }
}
