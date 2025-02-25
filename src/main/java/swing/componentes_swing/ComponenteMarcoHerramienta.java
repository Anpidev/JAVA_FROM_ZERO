package swing.componentes_swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
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

    public MarcoHerramientas(){
        setBounds(600, 500, 300, 550);
        miLamina = new JPanel();
        add(miLamina);

     
        EventoHerramientas colorAzul = new EventoHerramientas("Azul", Color.BLUE, new ImageIcon("src/main/java/componentes_swing/azul.gif"));
        EventoHerramientas colorRojo = new EventoHerramientas("Rojo", Color.RED, new ImageIcon("src/main/java/componentes_swing/rojo.gif"));
        EventoHerramientas colorVerde = new EventoHerramientas("Verde", Color.GREEN, new ImageIcon("src/main/java/componentes_swing/verde.gif"));
        JToolBar barra = new JToolBar();
        barra.add(colorAzul);
        barra.add(colorRojo);
        barra.add(colorVerde);
        add(barra,BorderLayout.NORTH);

       
    }

    // Clase interna Evento
    private class EventoHerramientas extends AbstractAction {
        private JPanel panel;

        public EventoHerramientas(String nombre, Color colorFondo, Icon icono) {
            putValue(Action.NAME, nombre);
            putValue(Action.SMALL_ICON, icono);
            putValue("Color_Fondo", colorFondo);
            this.panel = miLamina;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Color colorFondo = (Color) getValue("Color_Fondo");
            panel.setBackground(colorFondo);
            System.out.println("Nombre: " + getValue(Action.NAME) + ", Descripción: " + getValue(Action.SHORT_DESCRIPTION));
        }
    }
}
