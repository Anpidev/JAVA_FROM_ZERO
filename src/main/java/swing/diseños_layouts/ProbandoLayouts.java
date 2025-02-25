package swing.diseños_layouts;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ProbandoLayouts {

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
        // FlowLayout miDisposicion = new FlowLayout(FlowLayout.RIGHT);
        // lamina.setLayout(miDisposicion);
        // lamina.setLayout(new FlowLayout(FlowLayout.LEFT));

        add(lamina);

    }

}

class PanelconLayout extends JPanel {

    public PanelconLayout() {
        // setLayout(new FlowLayout(FlowLayout.CENTER, 50,70));

        setLayout(new BorderLayout(10,10));

        add(new JButton("Amarillo"),BorderLayout.NORTH);

        add(new JButton("Rojo"),BorderLayout.EAST);

        add(new JButton("Azul"),BorderLayout.WEST);

        add(new JButton("Verde"),BorderLayout.SOUTH);

        add(new JButton("Naranja"),BorderLayout.CENTER);

    }
}
