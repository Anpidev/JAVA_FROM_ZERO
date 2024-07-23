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
    public MiJFrame() {
        // setSize(600, 350);

        // setLocationRelativeTo(null);Si ponemos null la ventana se localiza en el
        // centro
        setExtendedState(JFrame.NORMAL);// como aparece la pantalla por ejemplo a pantalla completa, normal, en la barra
                                        // de tareas como icono.
        setTitle("Ventana de prueba");
        setBounds(600, 350, 450, 450);// método para acunar setSize y setLocation de una sola vez
        // setResizable(false); Para que no se pueda ajustar la pantalla de forma manual
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}