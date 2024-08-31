import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Flowlayouts {

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
        //FlowLayout miDisposicion = new FlowLayout(FlowLayout.RIGHT);
        //lamina.setLayout(miDisposicion);
        //lamina.setLayout(new FlowLayout(FlowLayout.LEFT));

        add(lamina);

    }

}

class PanelconLayout extends JPanel {

    public PanelconLayout() {
        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(new JButton("Amarillo"));

        add(new JButton("Rojo"));

        add(new JButton("Azul"));

    }
}
