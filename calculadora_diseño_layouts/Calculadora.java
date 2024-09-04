package calculadora_diseño_layouts;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculadora {
    public static void main(String[] args) {
        MarcoCalculadora miMarco = new MarcoCalculadora();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoCalculadora extends JFrame {
    public MarcoCalculadora() {
        setTitle("Calculadora");
        setBounds(150, 170, 400, 500);
        LaminaCalculadora miLamina = new LaminaCalculadora();
        add(miLamina);
        setVisible(true);

    }

}

class LaminaCalculadora extends JPanel {

    public LaminaCalculadora() {
        comienzo = true;
        setLayout(new BorderLayout());
        pantalla = new JButton("0");
        pantalla.setEnabled(false);
        add(pantalla, BorderLayout.NORTH);
        numeracion = new JPanel();
        numeracion.setLayout(new GridLayout(4, 4));
        InsertarNumero insertar = new InsertarNumero();
        crearBoton("7", insertar);
        crearBoton("8", insertar);
        crearBoton("9", insertar);
        crearBoton("/", insertar);
        crearBoton("4", insertar);
        crearBoton("5", insertar);
        crearBoton("6", insertar);
        crearBoton("x", insertar);
        crearBoton("1", insertar);
        crearBoton("2", insertar);
        crearBoton("3", insertar);
        crearBoton("-", insertar);
        crearBoton("0", insertar);
        crearBoton(".", insertar);
        crearBoton("=", insertar);
        crearBoton("+", insertar);

        add(numeracion, BorderLayout.CENTER);

    }

    private void crearBoton(String textoBoton, InsertarNumero oyente) {
        JButton boton = new JButton(textoBoton);
        boton.addActionListener(oyente);
        numeracion.add(boton);
    }

    class InsertarNumero implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String entrada = e.getActionCommand();
            if (comienzo) {
                pantalla.setText(entrada);
                comienzo = false;
            } else {
                pantalla.setText(pantalla.getText() + entrada);
            }
        }
    }

    private JButton pantalla;
    private JPanel numeracion;
    boolean comienzo;
}
