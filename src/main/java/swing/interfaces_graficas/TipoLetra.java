package swing.interfaces_graficas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TipoLetra {
    public static void main(String[] args) {
        MarcoFuente miMarco = new MarcoFuente();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoFuente extends JFrame {
    public MarcoFuente() {
        setBounds(300, 300, 400, 850);
        LaminaFuente miLamina = new LaminaFuente();
        add(miLamina);
        setVisible(true);
    }
}

class LaminaFuente extends JPanel {

    public LaminaFuente(){
        fuenteElegida=JOptionPane.showInputDialog("Escribe la fuente que quieres utilizar");
        letraPresente=false;
        misFuentes=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

    }

    
    @Override
    protected void paintComponent(Graphics g) { 
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
       
        Font miLetra;
       
        for (String nombreFuente : misFuentes) {
            if(nombreFuente.equals(fuenteElegida)) letraPresente=true;
        }
        if(letraPresente) miLetra= new Font(fuenteElegida, Font.BOLD, 20);
        else{
            g2.setPaint(Color.RED);
            g2.drawString("No se encontró la fuente específicada. Se escribirá en otra fuente", 20, 20);
            miLetra=new Font(misFuentes[0],Font.BOLD,20);
        }
        g2.setFont(miLetra);
        g2.setPaint(Color.BLUE);
        g2.drawString("Hola a todos", 100, 100);
    }


private String fuenteElegida;
private boolean letraPresente;
private String [] misFuentes;
}

