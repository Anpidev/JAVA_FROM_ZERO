package eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class EventosVariasFuentes {
    public static void main(String[] args) {
        // Crea una instancia de MarcosFuentes, que es la ventana principal de la
        // aplicación
        MarcosFuentes miMarco = new MarcosFuentes();
        // Establece la operación de cierre para que el JFrame se cierre correctamente
        miMarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}

class MarcosFuentes extends JFrame {
    public MarcosFuentes() {
        // Configura el tamaño y la ubicación del JFrame
        setBounds(600, 500, 300, 550);
        // Añade un JPanel (LaminasFuentes) a la ventana
        add(new LaminasFuentes());
        // Hace visible la ventana
        setVisible(true);
    }
}

class LaminasFuentes extends JPanel {

    public LaminasFuentes() {
        // Comentado: Código original para crear botones y añadirlos al panel
        /*
         * JButton botonAzul = new JButton("Azul");
         * JButton botonRojo = new JButton("Rojo");
         * JButton botonVerde = new JButton("Verde");
         * add(botonVerde);
         * add(botonRojo);
         * add(botonAzul);
         */

        // Crea instancias de EventoColorFondo con diferentes colores
        EventoColorFondo colorAzul = new EventoColorFondo("Azul", Color.BLUE);
        EventoColorFondo colorRojo = new EventoColorFondo("Rojo", Color.RED);
        EventoColorFondo colorVerde = new EventoColorFondo("Verde", Color.GREEN);

        // Añade botones al panel, cada uno asociado con una acción para cambiar el
        // color de fondo
        add(new JButton(colorAzul));
        add(new JButton(colorVerde));
        add(new JButton(colorRojo));

        // Configura el mapa de entradas para gestionar los atajos de teclado
        InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        KeyStroke teclaVerde = KeyStroke.getKeyStroke("ctrl B");
        mapaEntrada.put(teclaVerde, "fondoVerde");
        mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "fondoAzul");
        KeyStroke teclaRoja = KeyStroke.getKeyStroke("ctrl C");
        mapaEntrada.put(teclaRoja, "fondoRojo");

        // Configura el mapa de acciones para vincular los atajos de teclado con las
        // acciones correspondientes
        ActionMap mapaAccion = getActionMap();
        mapaAccion.put("fondoAzul", colorAzul);
        mapaAccion.put("fondoVerde", colorVerde);
        mapaAccion.put("fondoRojo", colorRojo);
    }

    private class EventoColorFondo extends AbstractAction {

        public EventoColorFondo(String nombre, Color colorFondo) {
            // Configura los valores de la acción
            putValue(Action.NAME, nombre);
            putValue(Action.SHORT_DESCRIPTION, "Pone el JPanel de color " + nombre);
            putValue("Color_Fondo", colorFondo);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // Obtiene el color de fondo almacenado y cambia el color de fondo del JPanel
            Color colorFondo = (Color) getValue("Color_Fondo");
            setBackground(colorFondo);
            // Imprime información sobre la acción realizada en la consola
            System.out
                    .println("Nombre " + getValue(Action.NAME) + " Descripción " + getValue(Action.SHORT_DESCRIPTION));
        }
    }
}
