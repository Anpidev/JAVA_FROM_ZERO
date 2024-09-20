package eventos;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class EventosClaseAdaptadora {

    public static void main(String[] args) {
        MarcoAdapta miMarco = new MarcoAdapta();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.addWindowListener(new EventoAdapta());
    }

}

class MarcoAdapta extends JFrame {

    public MarcoAdapta() {
        setBounds(300, 300, 600, 350);
        setVisible(true);
    }
}

class EventoAdapta extends WindowAdapter {
    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Gracias por usar nuestra APP. Hasta pronto");
    }
}
