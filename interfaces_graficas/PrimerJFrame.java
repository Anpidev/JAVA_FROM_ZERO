package interfaces_graficas;

import javax.swing.JFrame;

public class PrimerJFrame {
    public static void main(String[] args) {

        JFrame miVentana = new JFrame();

        // DEFINIMOS EL TAMAÑO QUE POR DEFECTO ES CERO
        miVentana.setSize(600, 350);
        // BUSCAMOS EL VALOR DE LA CONSTANTE DE CLASE O PONER EL NOMBRE DE LA CONSTANTE
        miVentana.setDefaultCloseOperation(3);
        /*
         * OPCION CON NOMBRE DE LA CONSTANTE
         * miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         */
        // PARA COLOCAR DONDE APARECERÁ LA VENTANA
        miVentana.setLocation(600, 350);

        // AHORA FALTA DARLE VISIBILIDAD A LA VENTANA, POR DEFECTO INVISIBLE (ESTA SIEMPRE SE COLOCA LA ULTIMA)
        miVentana.setVisible(true);

    }
}
