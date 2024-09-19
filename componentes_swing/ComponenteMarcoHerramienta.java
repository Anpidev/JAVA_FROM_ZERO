package componentes_swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class ComponenteMarcoHerramienta {
    public static void main(String[] args) {
        MarcoHerramientas miMarco = new MarcoHerramientas();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MarcoHerramientas extends JFrame {
    JPanel miLamina;

    public MarcoHerramientas() {
        setBounds(600, 500, 300, 550);
        miLamina = new JPanel();
        add(miLamina);

     
        Evento colorAzul = new Evento("Azul", Color.BLUE, miLamina);
        Evento colorRojo = new Evento("Rojo", Color.RED, miLamina);
        Evento colorVerde = new Evento("Verde", Color.GREEN, miLamina);
        JToolBar barra = new JToolBar();
        barra.add(colorAzul);
        barra.add(colorRojo);
        barra.add(colorVerde);
        add(barra,BorderLayout.NORTH);

       
    }

    // Clase interna Evento
    private class Evento extends AbstractAction {
        private JPanel panel;

        public Evento(String nombre, Color colorFondo, JPanel panel) {
            putValue(Action.NAME, nombre);
            putValue(Action.SHORT_DESCRIPTION, "Pone el JPanel de color " + nombre);
            putValue("Color_Fondo", colorFondo);
            this.panel = panel;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Color colorFondo = (Color) getValue("Color_Fondo");
            panel.setBackground(colorFondo);
            System.out.println("Nombre: " + getValue(Action.NAME) + ", Descripción: " + getValue(Action.SHORT_DESCRIPTION));
        }
    }
}
