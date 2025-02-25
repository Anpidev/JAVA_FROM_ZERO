package aprendiendo_interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTempoFecha {
    public static void main(String[] args) {

        Temporizador oyente = new Temporizador();
        Timer miTemporizador = new Timer(5000, oyente);

        miTemporizador.start();
        JOptionPane.showMessageDialog(null, "Pulsa ACEPTAR para detener");

    }
}

    class Temporizador implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Date horaActual=new Date();
            System.out.println(horaActual);
        }

    }

