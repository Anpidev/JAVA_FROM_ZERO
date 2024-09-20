package eventos;

// Importación de clases necesarias para la interfaz gráfica y el manejo de eventos
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// Clase principal que inicia la aplicación
public class EventosVariosOyentes {
    public static void main(String[] args) {
        // Crea una instancia de la ventana principal
        Marco_Principal mimarco = new Marco_Principal();

        // Configura la operación de cierre de la ventana principal para que termine la
        // aplicación
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Hace visible la ventana principal
        mimarco.setVisible(true);
    }
}

// Clase que define la ventana principal de la aplicación
class Marco_Principal extends JFrame {

    public Marco_Principal() {
        // Establece el título de la ventana principal
        setTitle("Múltiples oyentes");

        // Define la posición y tamaño de la ventana principal (x, y, ancho, alto)
        setBounds(1300, 100, 300, 200);

        // Crea una instancia del panel que se añadirá a la ventana principal
        Lamina_Principal lamina = new Lamina_Principal();

        // Añade el panel a la ventana principal
        add(lamina);
    }
}

// Clase que define el panel dentro de la ventana principal
class Lamina_Principal extends JPanel {

    public Lamina_Principal() {
        // Crea un botón con la etiqueta "Nuevo"
        JButton boton_nuevo = new JButton("Nuevo");

        // Añade el botón al panel
        add(boton_nuevo);

        // Crea un botón con la etiqueta "Cerrar todo"
        boton_cerrar = new JButton("Cerrar todo");

        // Añade el botón al panel
        add(boton_cerrar);

        // Asocia un ActionListener al botón "Nuevo" para manejar los eventos de clic
        boton_nuevo.addActionListener(new CreadoraMarco());
    }

    // Clase interna que maneja el evento de clic del botón "Nuevo"
    private class CreadoraMarco implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Crea una nueva ventana y pasa el botón "Cerrar todo" como parámetro
            MarcoNuevo miMarco = new MarcoNuevo(boton_cerrar);

            // Hace visible la nueva ventana
            miMarco.setVisible(true);
        }
    }

    // Botón que se pasará a las nuevas ventanas para cerrarlas
    JButton boton_cerrar;
}

// Clase que define una nueva ventana
class MarcoNuevo extends JFrame {
    // Constructor que recibe un botón como parámetro
    public MarcoNuevo(JButton boton) {
        // Incrementa el contador de ventanas
        contador++;

        // Establece el título de la ventana incluyendo el número de ventana
        setTitle("Ventana " + contador);

        // Define la posición y tamaño de la ventana en función del contador
        setBounds(50 * contador, 50 * contador, 350, 200);

        // Asocia un ActionListener al botón recibido para manejar el evento de clic
        boton.addActionListener(new CierraTodo());
    }

    // Clase interna que maneja el evento de clic del botón "Cerrar todo"
    private class CierraTodo implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Cierra la ventana actual
            dispose();
        }
    }

    // Contador estático para llevar el número de ventanas creadas
    private static int contador = 0;
}
