package eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventoCambiandoOyente {

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

    class PanelJPanel extends JPanel {
        JButton botonAzul = new JButton("Azul");
        JButton botonRojo = new JButton("Rojo");
        JButton botonAmarillo = new JButton("Amarillo");
        // Para agregar el botón a lámina crear constructor

        public PanelJPanel() {
            add(botonAzul);
            add(botonRojo);
            add(botonAmarillo);
            ColorDeFondo azul = new ColorDeFondo(Color.BLUE);
            ColorDeFondo rojo = new ColorDeFondo(Color.RED);
            ColorDeFondo amarillo = new ColorDeFondo(Color.YELLOW);

            botonAzul.addActionListener(azul);
            botonRojo.addActionListener(rojo);
            botonAmarillo.addActionListener(amarillo);
        }

       private class ColorDeFondo implements ActionListener {

            public ColorDeFondo(Color c) {
                colorDeFondo = c;
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                setBackground(colorDeFondo);
            }

            private Color colorDeFondo;

        }
    }

}
