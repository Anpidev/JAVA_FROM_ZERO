package interfaces_graficas;

import javax.swing.JFrame;

public class MarcoJFrame  extends JFrame {

    public MarcoJFrame (){
        setBounds(300,300,800,450);
        LaminaJPanel miLamina = new LaminaJPanel();
        add(miLamina);
        setVisible(true);
    }
}