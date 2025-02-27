package eventos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class EventosTeclado {
    public static void main(String[] args) {
        MarcoTeclado miMarco = new MarcoTeclado();
        miMarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        miMarco.addKeyListener(new TecladoEventos());

    }
}

class MarcoTeclado extends JFrame {
    public MarcoTeclado() {
        setBounds(300, 300, 600, 350);
        setVisible(true);

    }

}

class TecladoEventos implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {
        // System.out.println("Has tecleado una tecla");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //if(e.getKeyCode()==74)System.out.println("Has pulsado la tecla J");
        /*
         * /System.out.println("Has pulsado la tecla: "+ e.getKeyChar());
         * System.out.println("Has pulsado la tecla: "+ e.getKeyCode()); para tener
         * codigos de todas las teclas incluidos lo que no son caracteres.
         * También se puede usar en vez de getKeyCode la constante seria asi:
         * KeyEvent.VK_J --VK.J es la constante para J.
         */
        System.out.println("Has pulsado la tecla: "+KeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // System.out.println("Has soltado una tecla");
    }

}