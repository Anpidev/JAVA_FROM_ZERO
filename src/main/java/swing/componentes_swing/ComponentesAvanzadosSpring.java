
 
package swing.componentes_swing;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import javax.swing.Spring;


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
        SpringLayout miLayout = new SpringLayout();
        setLayout(miLayout);
        add(boton1);
        add(boton2);
        add(boton3);
        Spring muelle = Spring.constant(0, 10, 100);
        miLayout.putConstraint(SpringLayout.WEST,boton1,muelle,SpringLayout.WEST,this);
        miLayout.putConstraint(SpringLayout.WEST,boton2,muelle,SpringLayout.EAST,boton1);
        miLayout.putConstraint(SpringLayout.WEST,boton3,muelle,SpringLayout.EAST,boton2);
        miLayout.putConstraint(SpringLayout.EAST,this,muelle,SpringLayout.EAST,boton3);

    }

   
}

    

