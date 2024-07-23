package interfaces_graficas;

import javax.swing.JFrame;

public class PrimerJFrame {
    public static void main(String[] args) {

        /*
         * PRIMERA FORMA DE HACER UNA VENTANA EN EL PROPIO MAIN (NO ES LA MEJOR )
         * JFrame miVentana = new JFrame();
         * 
         * DEFINIMOS EL TAMAÑO QUE POR DEFECTO ES CERO
         * miVentana.setSize(600, 350);
         * BUSCAMOS EL VALOR DE LA CONSTANTE DE CLASE O PONER EL NOMBRE DE LA CONSTANTE
         * miVentana.setDefaultCloseOperation(3);
         * 
         * OPCION CON NOMBRE DE LA CONSTANTE
         * miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         * 
         * PARA COLOCAR DONDE APARECERÁ LA VENTANA
         * miVentana.setLocation(600, 350);
         * 
         * AHORA FALTA DARLE VISIBILIDAD A LA VENTANA, POR DEFECTO INVISIBLE (ESTA
         * SIEMPRE SE COLOCA LA ULTIMA)
         * miVentana.setVisible(true);
         * 
         */

         MiJFrame miVentana = new MiJFrame();
    }
}
// SEGUNDA FORMA USANDO UNA CLASE EXTERNA

 class MiJFrame extends JFrame {
    public MiJFrame(){
    setSize(600, 350);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocation(600, 350);
    setVisible(true);

    }
 }