package eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventosVariasFuentes {
    public static void main(String[] args) {
        MarcosFuentes miMarco = new MarcosFuentes();
        miMarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

}

class MarcosFuentes extends JFrame {
    public MarcosFuentes() {
        setBounds(600, 500, 300, 550);
        add(new LaminasFuentes());
        setVisible(true);

    }

}

class LaminasFuentes extends JPanel {

    public LaminasFuentes() {

       /*  JButton botonAzul = new JButton("Azul");
        JButton botonRojo = new JButton("Rojo");
        JButton botonVerde = new JButton("Verde");
        add(botonVerde);
        add(botonRojo);
        add(botonAzul);*/

        EventoColorFondo colorAzul= new EventoColorFondo("Azul", Color.BLUE);
        EventoColorFondo colorRojo= new EventoColorFondo("Rojo", Color.RED);
        EventoColorFondo colorVerde= new EventoColorFondo("Verde", Color.GREEN);
        add(new JButton(colorAzul));
        add(new JButton(colorVerde));
        add(new JButton(colorRojo));

    }

   private class EventoColorFondo extends AbstractAction {

        public EventoColorFondo(String nombre, Color colorFondo) {
            putValue(Action.NAME, nombre);
            putValue("Color_Fondo", colorFondo);

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Color colorFondo = (Color) getValue("Color_Fondo");
            setBackground(colorFondo);
        }

    }
}
