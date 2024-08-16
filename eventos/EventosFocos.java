package eventos;

import java.awt.Graphics; // Importa la clase Graphics para dibujar en el panel.
import java.awt.event.FocusEvent; // Importa la clase FocusEvent para manejar eventos de foco.
import java.awt.event.FocusListener; // Importa la interfaz FocusListener para escuchar eventos de foco.

import javax.swing.JFrame; // Importa la clase JFrame para crear una ventana.
import javax.swing.JLabel; // Importa la clase JLabel para crear etiquetas de texto.
import javax.swing.JPanel; // Importa la clase JPanel para crear un panel.
import javax.swing.JTextField; // Importa la clase JTextField para crear campos de texto.

// Clase principal donde se ejecuta el programa.
public class EventosFocos {

    public static void main(String[] args) {
        // Crea una instancia de la clase MarcoFoco y configura la acción al cerrar la
        // ventana.
        MarcoFoco miMarco = new MarcoFoco();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

// Clase que extiende JFrame para crear una ventana personalizada.
class MarcoFoco extends JFrame {

    // Constructor de la clase.
    public MarcoFoco() {
        // Establece las dimensiones y posición de la ventana (x, y, ancho, alto).
        setBounds(300, 300, 600, 350);
        // Hace la ventana visible.
        setVisible(true);
        // Añade un panel con los componentes gráficos.
        add(new PanelFocos());
    }
}

// Clase que extiende JPanel para manejar los componentes gráficos.
class PanelFocos extends JPanel {

    // Campos de texto que se mostrarán en el panel.
    private JTextField campoTexto1, campoTexto2, campoTexto3;
    private JLabel etiqueta1, etiqueta2, etiqueta3;

    @Override
    public void paintComponent(Graphics g) {
        // Llama al método de la superclase para pintar el panel.
        super.paintComponent(g);

        // Crea tres campos de texto.
        campoTexto1 = new JTextField();
        campoTexto2 = new JTextField();
        campoTexto3 = new JTextField();

        // Crea las etiquetas para los campos de texto.
        etiqueta1 = new JLabel("Usuario");
        etiqueta2 = new JLabel("Contraseña");
        etiqueta3 = new JLabel("Email");

        // Establece la posición y tamaño del primer campo de texto.
        campoTexto1.setBounds(120, 10, 150, 20);
        // Establece la posición y tamaño del segundo campo de texto.
        campoTexto2.setBounds(120, 50, 150, 20);
        // Establece la posición y tamaño del tercer campo de texto.
        campoTexto3.setBounds(120, 90, 150, 20);

        // Establece la posición y tamaño de la primera etiqueta.
        etiqueta1.setBounds(70, 10, 150, 20);
        // Establece la posición y tamaño de la segunda etiqueta.
        etiqueta2.setBounds(70, 50, 150, 20);
        // Establece la posición y tamaño de la tercera etiqueta.
        etiqueta3.setBounds(70, 90, 150, 20);

        // Añade los campos de texto al panel.
        add(campoTexto1);
        add(campoTexto2);
        add(campoTexto3);
        // Añade las etiquetas al panel.
        add(etiqueta1);
        add(etiqueta2);
        add(etiqueta3);

        // Crea un objeto de la clase Focos para manejar eventos de foco.
        Focos miFoco = new Focos();
        // Añade el listener de foco al primer campo de texto.
        campoTexto1.addFocusListener(miFoco);
        // Añade el listener de foco al segundo campo de texto.
        campoTexto2.addFocusListener(miFoco);
        // Añade el listener de foco al tercer campo de texto.
        campoTexto3.addFocusListener(miFoco);
    }

    // Clase interna que implementa FocusListener para manejar eventos de foco.
    private class Focos implements FocusListener {

        @Override
        public void focusGained(FocusEvent e) {
            // Método llamado cuando el campo de texto gana el foco.
            // En este caso, imprime un mensaje en la consola.
            System.out.println("El campo de texto ha ganado el foco");
        }

        @Override
        public void focusLost(FocusEvent e) {
            // Método llamado cuando el campo de texto pierde el foco.
            // Imprime un mensaje en la consola identificando cuál campo perdió el foco.
            if (e.getSource() == campoTexto1) {
                System.out.println("El campo 1 ha perdido el foco");
            } else if (e.getSource() == campoTexto2) {
                System.out.println("El campo 2 ha perdido el foco");
            } else if (e.getSource() == campoTexto3) {
                System.out.println("El campo 3 ha perdido el foco");
            }
        }
    }
}
