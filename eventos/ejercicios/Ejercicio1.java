
/*En este ejercicio debes crear un marco con un panel en su interior. Al hacer clic con el ratón en
el panel, debe salir un mensaje de texto en consola. El mensaje puede ser el que quieras. */

package eventos.ejercicios;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ejercicio1 {
    public static void main(String[] args) {
        MarcoVentana miMarco = new MarcoVentana();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class MarcoVentana extends JFrame {
    public MarcoVentana() {
        setBounds(50, 50, 300, 500);
        PanelVentana miPanel= new PanelVentana();
        miPanel.addMouseListener(new EventoRaton());
        add(miPanel);
        setVisible(true);

    }
}

class PanelVentana extends JPanel {

}

class EventoRaton implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
       System.out.println("Enhorabuena. Ejercicio sobre eventos de ratón realizado.");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       
    }

    @Override
    public void mouseExited(MouseEvent e) {
       
    }

}