package diseños_layouts;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VariosLayouts {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        MarcoLayout miMarco = new MarcoLayout();

        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        miMarco.setVisible(true);

    }

}

class MarcoLayout extends JFrame {

    public MarcoLayout() {

        setTitle("Disposiciones");

        setBounds(600, 350, 600, 300);

        PanelconLayout lamina = new PanelconLayout();
        PanelconLayout2 lamina2= new PanelconLayout2();

        add(lamina, BorderLayout.SOUTH);
        add(lamina2, BorderLayout.NORTH);

    }

}

class PanelconLayout extends JPanel {

    public PanelconLayout() {

        setLayout(new BorderLayout());

        add(new JButton("Azul"), BorderLayout.WEST);

        add(new JButton("Verde"), BorderLayout.EAST);

        add(new JButton("Naranja"), BorderLayout.CENTER);

    }
}

class PanelconLayout2 extends JPanel {

    public PanelconLayout2() {
        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(new JButton("Amarillo"));

        add(new JButton("Rojo"));

    }
}
