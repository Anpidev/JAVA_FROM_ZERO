
 
package componentes_swing;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;


public class ComponentesAvanzadosSpring {
 

    public static void main(String[] args) {
        MarcoMuelle miMarco = new MarcoMuelle();
        miMarco.setDefaultCloseOperation(3);
    }
}

class MarcoMuelle extends JFrame {
    public MarcoMuelle() {
        setBounds(600, 200, 600, 400);
        LaminaMuelle miLamina = new LaminaMuelle();
        add(miLamina);
        setVisible(true);
    }

}

class LaminaMuelle extends JPanel {

    public LaminaMuelle() {
        
        JButton boton1=new JButton ("boton 1 ");
        JButton boton2 = new JButton ("boton 2");
        JButton boton3 = new JButton ("boton 3");
        add(boton1);
        add(boton2);
        add(boton3);

        

    }

   
}

    

