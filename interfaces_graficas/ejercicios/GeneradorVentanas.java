package interfaces_graficas.ejercicios;

import javax.swing.JFrame;

public class GeneradorVentanas extends JFrame{

    public GeneradorVentanas(String titulo, int posX, int posY, int ancho, int alto){
        setTitle(titulo);
        setExtendedState(JFrame.NORMAL);
        setResizable(false);                          
        setBounds(posX,posY, ancho, alto);
        setDefaultCloseOperation(GeneradorVentanas.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
