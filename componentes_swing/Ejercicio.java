package componentes_swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ejercicio {
    public static void main(String[] args) {
        MarcoEjercicio miMarco = new MarcoEjercicio();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoEjercicio extends JFrame {
    public MarcoEjercicio() {
        setTitle("Ejercicio Componentes Swing");
        setBounds(600, 300, 600, 500);
        add(new LaminaEjercicio());
        setVisible(true);
    }
}

class LaminaEjercicio extends JPanel {
    private JTextField email;
    private JLabel etiqueta;

    public LaminaEjercicio() {
        JLabel emailEtiqueta = new JLabel("Email");
        add(emailEtiqueta);
        
        email = new JTextField(20);
        add(email);
        
        JButton boton = new JButton("Comprobar email");
        add(boton);
        
        // Inicializar la etiqueta y agregarla al panel
        etiqueta = new JLabel("");  // Inicializa con texto vacío
        add(etiqueta);

        // Añadir ActionListener al botón
        boton.addActionListener(new EventoEjercicio());
    }

    private class EventoEjercicio implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int contador = 0;
            String mail = email.getText();  
            
            // Verificar si el email contiene '@'
            for (int i = 0; i < mail.length(); i++) {
                char caracter = mail.charAt(i);
                if (caracter == '@') {
                    contador++;
                }
            }
            
            // Actualiza la etiqueta en lugar de crear una nueva
            if (contador == 1) {
                etiqueta.setText("Email correcto");
            } else {
                etiqueta.setText("Email incorrecto");
            }
        }
    }
}
