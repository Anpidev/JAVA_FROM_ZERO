package swing.interfaces_graficas;
import java.awt.Graphics;

import javax.swing.JPanel;

public class LaminaJPanel extends JPanel{

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawRect(20, 20, 125, 75);
        g.drawLine(20,20, 145, 95);
        g.fillRect(20,200,125,75);

    }
}
