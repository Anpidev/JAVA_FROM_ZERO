package eventos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

public class CambiosEstados {

    public static void main(String[] args) {
        MarcoVentana miMarco = new MarcoVentana();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.addWindowStateListener(new EventosVentana());
    }

}

class MarcoVentana extends JFrame {

    public MarcoVentana() {
        setBounds(300, 300, 600, 350);
        setVisible(true);
    }
}

class EventosVentana implements WindowStateListener {

    @Override
    public void windowStateChanged(WindowEvent e) {
       System.out.println("La ventana ha cambiado de estado");
       System.out.println(e.getNewState());
       
    }
   /*  @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Gracias por usar nuestra APP. Hasta pronto");
    }

    @Override
    public void windowOpened(WindowEvent e ){
        System.out.println("Bienvenido a la APP");
    }*/
}
