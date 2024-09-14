package componentes_swing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ComponenteJSlider {
  
    public static void main(String[] args) {
        MarcoJSlider miMarco = new MarcoJSlider();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoJSlider extends JFrame {
    public MarcoJSlider() {
        setBounds(400, 400, 700, 500);
        add(new LaminaJSlider());
        setVisible(true);
    }
}

class LaminaJSlider extends JPanel {
    public LaminaJSlider() {
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
        miCombo.addActionListener(new EventoJSlider());
        superior.add(miCombo);
        miSlider = new JSlider(8,36,24);
        miSlider.setMajorTickSpacing(12);
        miSlider.setMinorTickSpacing(2);
        miSlider.setPaintTicks(true);
        miSlider.setPaintLabels(true);
        miSlider.addChangeListener(new ChangeListener(){

            @Override
            public void stateChanged(ChangeEvent e) {
                texto.setFont(new Font((String)miCombo.getSelectedItem(),Font.PLAIN,miSlider.getValue()));
            }
            
        });
        superior.add(miSlider);
        add(superior, BorderLayout.NORTH);

    }

    private class EventoJSlider implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            texto.setFont(new Font((String)miCombo.getSelectedItem(),Font.PLAIN,12));
        }

    }

    private JLabel texto;
    private JComboBox miCombo;
    private JSlider miSlider;
}

