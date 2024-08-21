package eventos;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventosVariasFuentes {
    public static void main(String[] args) {
        MarcosFuentes miMarco = new MarcosFuentes();

    }

}

class MarcosFuentes extends JFrame {
    public MarcosFuentes(){
        setBounds(600,500,300,550);
        add( new LaminasFuentes());
        setVisible(true);

    }


}

class LaminasFuentes extends JPanel{

    public LaminasFuentes(){

        JButton botonAzul = new JButton("Azul");
        JButton botonRojo = new JButton("Rojo");
        JButton botonVerde = new JButton("Verde");
        add(botonVerde);
        add(botonRojo);
        add(botonAzul);
    }
}