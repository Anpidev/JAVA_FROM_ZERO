package clases_internas;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.Timer;

public class Reloj {

    public  Reloj (int intervalo, boolean sonido){
        this.intervalo=intervalo;
        this.sonido=sonido;
    }

    public void ejecutarTemporizador(){
        ActionListener oyente= new DameLaHora();
        Timer miTemporizador = new Timer(intervalo, oyente);
        miTemporizador.start();
    }

   

    private int intervalo;
    private boolean sonido; 


    //HACEMOS UNA CLASE INTERNA CON MODIFICADOR PRIVATE (SOLO PARA CLASES INTERNAS)
private class DameLaHora implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
       
      Date ahora = new Date ();
      System.out.println("Cada tres segundos tiene su hora: "+ahora);
      if (sonido )Toolkit.getDefaultToolkit().beep();
    }
        
    }
}
