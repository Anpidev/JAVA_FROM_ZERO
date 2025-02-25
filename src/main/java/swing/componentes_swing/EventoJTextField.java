package swing.componentes_swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class EventoJTextField {
public static void main(String[] args) {
    MarcoJ miMarcoJ = new MarcoJ();
    miMarcoJ.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}

class MarcoJ extends JFrame {
    public MarcoJ() {
        setBounds(60, 300, 600, 400);
        add(new LaminaJ());
        setVisible(true);
    }

}

class LaminaJ extends JPanel {
    public LaminaJ() {
        JTextField cuadroTexto = new JTextField(20);
        Document miDocumento= cuadroTexto.getDocument();
        miDocumento.addDocumentListener(new EscuchaTexto());
        add(cuadroTexto);
       
    }

    class EscuchaTexto implements DocumentListener{

        @Override
        public void insertUpdate(DocumentEvent e) {
            System.out.println("Has introducido texto");
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            System.out.println("Has eliminado texto");
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'changedUpdate'");
        }

    }
}