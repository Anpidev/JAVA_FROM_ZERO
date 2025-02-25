package poo.clases_internas;

import javax.swing.JOptionPane;

public class PruebaTemporizador {

    public static void main(String[] args) {

        Reloj miReloj = new Reloj(3000, true);

        miReloj.ejecutarTemporizador();
        JOptionPane.showMessageDialog(null, "Pulsa ACEPTAR para terminar");
    }
}
