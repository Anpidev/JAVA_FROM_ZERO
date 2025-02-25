package swing.componentes_swing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;;

public class ComponentesJComboBox {
    public static void main(String[] args) {
        MarcoJCombo miMarco = new MarcoJCombo();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoJCombo extends JFrame {
    public MarcoJCombo() {
        setBounds(400, 400, 700, 500);
        add(new LaminaJCombo());
        setVisible(true);
    }
}

class LaminaJCombo extends JPanel {
    public LaminaJCombo() {
        JPanel superior = new JPanel();
        setLayout(new BorderLayout());
        texto = new JLabel("Viendo JComboBox");
        texto.setFont(new Font("Serif", Font.PLAIN, 12));
        add(texto, BorderLayout.CENTER);
        miCombo = new JComboBox();
        miCombo.addItem("Serif");
        miCombo.addItem("SanSerif");
        miCombo.addItem("Monospaced");
        miCombo.addItem("Dialog");
        miCombo.addItem("Calibri");
        miCombo.addActionListener(new EventoJCombo());
        superior.add(miCombo);
        add(superior, BorderLayout.NORTH);

    }

    private class EventoJCombo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            texto.setFont(new Font((String)miCombo.getSelectedItem(),Font.PLAIN,12));
        }

    }

    private JLabel texto;
    private JComboBox miCombo;
}