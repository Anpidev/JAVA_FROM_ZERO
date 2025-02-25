package practica_calculadora;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculadora {
    public static void main(String[] args) {
        // Crear y configurar el marco de la calculadora
        MarcoCalc miMarco = new MarcoCalc();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoCalc extends JFrame {
    public MarcoCalc() {
        setTitle("Calculadora");
        setBounds(150, 170, 400, 500);

        // Añadir la lámina principal de la calculadora
        add(new LaminaCalc());
        setVisible(true);
    }
}

class LaminaCalc extends JPanel {
    private JButton pantalla;
    private JPanel numeracion;
    private boolean comienzo = true;
    private String ultimaOperacion = "=";
    private double resultado = 0;

    public LaminaCalc() {
        setLayout(new BorderLayout());
        pantalla = new JButton("0");
        pantalla.setEnabled(false);
        add(pantalla, BorderLayout.NORTH);

        numeracion = new JPanel();
        numeracion.setLayout(new GridLayout(4, 4));

        // Definir los botones numéricos y de operación
        String[] botones = {
            "7", "8", "9", "/",
            "4", "5", "6", "x",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        // Crear botones con sus respectivos ActionListener
        for (String texto : botones) {
            crearBoton(texto);
        }

        add(numeracion, BorderLayout.CENTER);
    }

    // Método genérico para crear y agregar botones
    private void crearBoton(String texto) {
        JButton boton = new JButton(texto);
        boton.addActionListener(e -> manejarAccion(texto));
        numeracion.add(boton);
    }

    // Manejar la acción de cada botón
    private void manejarAccion(String texto) {
        if ("0123456789.".contains(texto)) {  // Si es un número o un punto decimal
            if (comienzo) {
                pantalla.setText(texto.equals(".") ? "0." : texto);
                comienzo = false;
            } else if (!(texto.equals(".") && pantalla.getText().contains("."))) {  // Evitar múltiples puntos
                pantalla.setText(pantalla.getText() + texto);
            }
        } else {  // Si es una operación
            realizarOperacion(texto);
        }
    }

    // Realiza la operación correspondiente
    private void realizarOperacion(String operacion) {
        try {
            double valorPantalla = Double.parseDouble(pantalla.getText());
            if (comienzo) {
                ultimaOperacion = operacion;
                return;
            }

            switch (ultimaOperacion) {
                case "+" : resultado += valorPantalla;
                case "-" : resultado -= valorPantalla;
                case "x" : resultado *= valorPantalla;
                case "/" :resultado = valorPantalla != 0 ? resultado / valorPantalla : Double.NaN;
                case "=" : resultado = valorPantalla;
            }

            pantalla.setText(Double.isNaN(resultado) ? "Error" : String.valueOf(resultado));
            ultimaOperacion = operacion;
            comienzo = true;

        } catch (NumberFormatException ex) {
            pantalla.setText("Error");
            comienzo = true;
        }
    }
}
