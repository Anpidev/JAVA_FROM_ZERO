package componentes_swing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ComponentesJCheckBox {
    public static void main(String[] args) {
        MarcoJCheck miMarco = new MarcoJCheck();
        miMarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}

class MarcoJCheck extends JFrame {
    public MarcoJCheck() {
        setBounds(600, 200, 600, 400);
        setLayout(new BorderLayout());

        LaminaJCheck texto = new LaminaJCheck();

        LaminaJCheck2 opciones = new LaminaJCheck2(texto);
        add(texto, BorderLayout.NORTH);
        add(opciones, BorderLayout.SOUTH);
        setVisible(true);
    }

}

class LaminaJCheck extends JPanel {

    public LaminaJCheck() {

        texto = new JTextArea(7, 20);
        JScrollPane laminaScroll = new JScrollPane(texto);
        texto.setLineWrap(true);
        add(laminaScroll);

    }

    public void cambiarFuente(int fuente) {
        texto.setFont(new Font("Serif", fuente, 12));
    }

    JTextArea texto;
}

class LaminaJCheck2 extends JPanel {

    public LaminaJCheck2(LaminaJCheck texto) {
        this.texto = texto;
        casilla1 = new JCheckBox("Poner texto en negrita", false);
        casilla1.addItemListener(new Comprobacion());
        add(casilla1);

        casilla2 = new JCheckBox("Poner texto en cursiva", false);
        casilla2.addItemListener(new Comprobacion());
        add(casilla2);

    }

    private class Comprobacion implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            int fuente = Font.PLAIN;
            if (casilla1.isSelected()) {
                fuente += Font.BOLD;
            }
            if (casilla2.isSelected()) {
                fuente += Font.ITALIC; // Añadir estilo cursiva
            }

            // Actualiza el estilo del texto en el JTextArea
            if (texto != null) {
                texto.cambiarFuente(fuente);
            }

        }
    }

    JCheckBox casilla1, casilla2;
    LaminaJCheck texto;
}
