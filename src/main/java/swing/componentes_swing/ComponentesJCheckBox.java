package swing.componentes_swing;

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
        miMarco.setDefaultCloseOperation(3);
    }
}

class MarcoJCheck extends JFrame {
    public MarcoJCheck() {
        setBounds(600, 200, 600, 400);
        add(new LaminaJCheck());
        setVisible(true);
    }

}

class LaminaJCheck extends JPanel {

    public LaminaJCheck() {

        setLayout(new BorderLayout());

        JPanel superior = new JPanel();
        JPanel inferior = new JPanel();

        area = new JTextArea(7, 20);
        JScrollPane laminaScroll = new JScrollPane(area);
        area.setLineWrap(true);
        superior.add(laminaScroll);

        casilla1 = new JCheckBox("Poner texto en negrita", false);
        casilla1.addItemListener(new Comprobacion());
        inferior.add(casilla1);

        casilla2 = new JCheckBox("Poner texto en cursiva", false);
        casilla2.addItemListener(new Comprobacion());
        inferior.add(casilla2);

        add(superior, BorderLayout.NORTH);
        add(inferior, BorderLayout.SOUTH);

    }

    private class Comprobacion implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            int fuente = Font.PLAIN;
            if (casilla1.isSelected()) {
                fuente += Font.BOLD;
            }
            if (casilla2.isSelected()) {
                fuente += Font.ITALIC;
            }

            if (area != null) {
                area.setFont(new Font("Serif", fuente, 12));

            }

        }
    }

    private JTextArea area;
    private JCheckBox casilla1, casilla2;
}
