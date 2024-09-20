package componentes_swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ComponenteJTextField {
    public static void main(String[] args) {
        MarcoComponente miMarco = new MarcoComponente();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class MarcoComponente extends JFrame {
    public MarcoComponente() {
        setBounds(60, 300, 600, 400);
        add(new LaminaComponente());
        setVisible(true);
    }

}

class LaminaComponente extends JPanel {
    public LaminaComponente() {
        cuadroTexto = new JTextField(20);
        add(cuadroTexto);
        cuadroTexto2 = new JTextField(20);
        
        JButton boton = new JButton("Obtener texto");
        
        boton.addActionListener(new ObtenerTexto());
        add(boton);
        add(cuadroTexto2);
    }

    private class ObtenerTexto implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //System.out.println(cuadroTexto.getText());
            cuadroTexto2.setText(cuadroTexto.getText());
        }

    }

    JTextField cuadroTexto, cuadroTexto2;
}