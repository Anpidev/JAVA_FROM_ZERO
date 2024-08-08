package eventos;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class EventosClaseAdaptadora {

    public static void main(String[] args) {
        MarcoVentana miMarco = new MarcoVentana();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.addWindowListener(new EventosVentana());
    }

}

class MarcoVentana extends JFrame {

    public MarcoVentana() {
        setBounds(300, 300, 600, 350);
        setVisible(true);
    }
}

class EventosVentana extends WindowAdapter {
    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Gracias por usar nuestra APP. Hasta pronto");
    }
}
