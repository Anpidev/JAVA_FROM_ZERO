package swing.interfaces_graficas;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class Lamina2D extends JPanel{

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        Rectangle2D rectangulo = new Rectangle2D.Double(100.25,100,200,150);
        BasicStroke miLapiz = new BasicStroke(4);
        g2.setPaint(Color.BLUE);
        g2.setStroke(miLapiz);
        g2.draw(rectangulo);
        //Color colorPersonalizado= new Color(125, 188,230);
        g2.setPaint(new Color(125, 188,230));
        g2.fill(rectangulo);

    }
}
