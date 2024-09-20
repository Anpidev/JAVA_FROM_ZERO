package diseños_layouts;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VariosLayouts {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        MarcoVarios miMarco = new MarcoVarios();

        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        miMarco.setVisible(true);

    }

}

class MarcoVarios extends JFrame {

    public MarcoVarios() {

        setTitle("Disposiciones");

        setBounds(600, 350, 600, 300);

        PanelVarios lamina = new PanelVarios();
        PanelVarios2 lamina2= new PanelVarios2();

        add(lamina, BorderLayout.SOUTH);
        add(lamina2, BorderLayout.NORTH);

    }

}

class PanelVarios extends JPanel {

    public PanelVarios() {

        setLayout(new BorderLayout());

        add(new JButton("Azul"), BorderLayout.WEST);

        add(new JButton("Verde"), BorderLayout.EAST);

        add(new JButton("Naranja"), BorderLayout.CENTER);

    }
}

class PanelVarios2 extends JPanel {

    public PanelVarios2() {
        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(new JButton("Amarillo"));

        add(new JButton("Rojo"));

    }
}
