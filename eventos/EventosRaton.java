package eventos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class EventosRaton {
    public static void main(String[] args) {
        MarcoRaton miMarco = new MarcoRaton();
        miMarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        miMarco.addMouseListener(new EventosMouse());
        miMarco.addMouseMotionListener(new ArrastreRaton());

    }
}

class MarcoRaton extends JFrame {
    public MarcoRaton() {
        setBounds(300, 300, 600, 350);
        setVisible(true);

    }

}

/*
 * class EventosMouse implements MouseListener{
 * 
 * @Override
 * public void mouseClicked(MouseEvent e) {
 * System.out.println("Has hecho click");
 * }
 * 
 * @Override
 * public void mousePressed(MouseEvent e) {
 * // TODO Auto-generated method stub
 * throw new
 * UnsupportedOperationException("Unimplemented method 'mousePressed'");
 * }
 * 
 * @Override
 * public void mouseReleased(MouseEvent e) {
 * // TODO Auto-generated method stub
 * throw new
 * UnsupportedOperationException("Unimplemented method 'mouseReleased'");
 * }
 * 
 * @Override
 * public void mouseEntered(MouseEvent e) {
 * // TODO Auto-generated method stub
 * throw new
 * UnsupportedOperationException("Unimplemented method 'mouseEntered'");
 * }
 * 
 * @Override
 * public void mouseExited(MouseEvent e) {
 * // TODO Auto-generated method stub
 * throw new
 * UnsupportedOperationException("Unimplemented method 'mouseExited'");
 * }
 * 
 * }
 */

class EventosMouse extends MouseAdapter {
    public void mouseClicked(MouseEvent e) {
        System.out.println("X= " + e.getX());
        System.out.println("Y= " + e.getY());
        if (e.getButton() == MouseEvent.BUTTON1) {
            System.out.println("Has pulsado el botón izquierdo");
        } else if (e.getButton() == MouseEvent.BUTTON3) {
            System.out.println("Has pulsado el botón derecho");
        } else if (e.getButton() == MouseEvent.BUTTON2) {
            System.out.println("Has pulsado el botón central");
        } else {
            System.out.println("Has hecho click con otro botón");
        }
    }

}

class ArrastreRaton implements MouseMotionListener{

    @Override
    public void mouseDragged(MouseEvent e) {
       System.out.println("Estás arrastrando el ratón");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
      System.out.println("Estás moviendo el ratón");
    }
    
}