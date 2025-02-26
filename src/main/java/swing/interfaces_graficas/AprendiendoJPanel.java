package swing.interfaces_graficas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AprendiendoJPanel {
    public static void main(String[] args) {
        MarcoTexto miMarco = new MarcoTexto();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoTexto extends JFrame {
    public MarcoTexto() {
        setBounds(400, 200, 600, 450);
        setTitle("Escribiendo en un marco");
        setVisible(true);

        // Agregar panel para poder pintar
        PrimerPanel miPanel = new PrimerPanel();
        add(miPanel);

        /*
         * Con clase interna anonima
         * add(new JPanel() {
         * Por defecto con tamaño y ubicacion del JFrame
         * 
         * @Override
         * public void paintComponent(Graphics g) {
         * 
         * Primero color
         * g.setColor(new Color(10, 44, 92));
         * 
         * Establecer fuente
         * g.setFont(new Font("Verdana", Font.ITALIC, 25));
         * 
         * Llamar a la clase padre para poder imprimir
         * g.drawString("Estamos escribiendo", 20, 20);
         * }
         * });
         * }
         */
    }

    class PrimerPanel extends JPanel {
        public PrimerPanel() {
            setBackground(new Color(195));
        }
        // Por defecto con tamaño y ubicacion del JFrame

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g); // Llamar a la clase padre para pintar el fondo
            // Primero color
            Color miColor = new Color(10, 44, 92);
            g.setColor(miColor);

            // Establecer fuente
            Font miLetra = new Font("Verdana", Font.ITALIC, 25);
            g.setFont(miLetra);

            // Llamar a la clase padre para poder imprimir
            g.drawString("Estamos escribiendo", 20, 20);
        }
    }
}
