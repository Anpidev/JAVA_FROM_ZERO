package swing.componentes_swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ComponentesJTextArea {
    public static void main(String[] args) {
        MarcoArea miMarco = new MarcoArea();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoArea extends JFrame {
    public MarcoArea() {
        setBounds(600, 400, 600, 500);
        add(new LaminaArea());
        setVisible(true);

    }

}

class LaminaArea extends JPanel {
    public LaminaArea() {
        miAreaTexto = new JTextArea(7, 25);
        JScrollPane laminaScroll = new JScrollPane(miAreaTexto);
        miAreaTexto.setLineWrap(true);
        add(laminaScroll);

        JButton boton = new JButton("Obtener texto");
        //CLASE ANONIMA
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(miAreaTexto.getText());
            }
        });
        add(boton);

    }

    JTextArea miAreaTexto;
}
