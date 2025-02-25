package swing.aprendiendo_interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizador {
    public static void main(String[] args) {

        Tempo oyente = new Tempo();
        Timer miTempo = new Timer(5000, oyente);

        miTempo.start();
        JOptionPane.showMessageDialog(null, "Pulsa ACEPTAR para detener");

    }
}

    class Tempo implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Hola a todos");
        }

    }

