package clases_internas;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.Timer;

public class Reloj {

    public Reloj(int intervalo, boolean sonido) {
        this.intervalo = intervalo;
        this.sonido = sonido;
    }

    public void ejecutarTemporizador() {

        /*
         * SI QUEREMOS UNA CLASE INTERNA LOCAL DEBE SER DECLARADA DENTRO DEL METODO
         * EJECUTAR TEMPORIZADOR Y SIN MODIFICADOR DE ACCESO.
         * ADEMAS QUITARIAMOS LOS CAMPOS DE CLASE Y PASARIAN A SER PARAMETROS DE
         * METODOS.
         * Y PRESCINDIR DEL CONSTRUCTOR.
         * 
         * class DameLaHora implements ActionListener{
         * 
         * @Override
         * public void actionPerformed(ActionEvent e) {
         * 
         * Date ahora = new Date ();
         * System.out.println("Cada tres segundos tiene su hora: "+ahora);
         * if (sonido )Toolkit.getDefaultToolkit().beep();
         * }
         */
        ActionListener oyente = new DameLaHora();
        Timer miTemporizador = new Timer(intervalo, oyente);
        miTemporizador.start();
    }

    private int intervalo;
    private boolean sonido;

    // HACEMOS UNA CLASE INTERNA CON MODIFICADOR PRIVATE (SOLO PARA CLASES INTERNAS)

    private class DameLaHora implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            Date ahora = new Date();
            System.out.println("Cada tres segundos tiene su hora: " + ahora);
            if (sonido)
                Toolkit.getDefaultToolkit().beep();
        }

    }
}
