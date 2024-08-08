package eventos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class EventoVentana {
    public static void main(String[] args) {
        MarcoVentana miMarco= new MarcoVentana();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.addWindowListener(new EventosVentana());
        
    }

}

class MarcoVentana extends JFrame {

    public MarcoVentana(){
        setBounds(300,300,600,350);
        setVisible(true);
    }
}

class EventosVentana implements WindowListener{

    @Override
    public void windowOpened(WindowEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'windowOpened'");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'windowClosing'");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'windowClosed'");
    }

    @Override
    public void windowIconified(WindowEvent e) {
      System.out.println("Ventana miminizada");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'windowDeiconified'");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'windowActivated'");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'windowDeactivated'");
    }

}
