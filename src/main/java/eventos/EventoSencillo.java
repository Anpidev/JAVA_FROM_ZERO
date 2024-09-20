package eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventoSencillo {

    public static void main(String[] args) {
        MarcoTexto miMarco = new MarcoTexto();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoTexto extends JFrame {
    public MarcoTexto() {
        setBounds(400, 200, 600, 450);
        setVisible(true);
        PanelJPanel miPanel = new PanelJPanel();
        add(miPanel);
    }

    class PanelJPanel extends JPanel implements ActionListener {
        JButton botonAzul = new JButton("Azul");
        JButton botonRojo = new JButton("Rojo");
        JButton botonAmarillo = new JButton("Amarillo");
        // Para agregar el botón a lámina crear constructor

        public PanelJPanel() {
            add(botonAzul);
            add(botonRojo);
            add(botonAmarillo);

            botonAzul.addActionListener(this);
            botonRojo.addActionListener(this);
            botonAmarillo.addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Object botonPulsado = e.getSource();
            if (botonPulsado == botonAzul) {
                setBackground(Color.BLUE);
            }
            else if (botonPulsado == botonRojo) {
                setBackground(Color.RED);
            }
            else if (botonPulsado == botonAmarillo) {
                setBackground(Color.yellow);
            }
        }

        /*
         * EL objeto evento sería e.
         * El objeto fuente es el botón.
         * El objeto listener es la lámina.
         */

    }
}
