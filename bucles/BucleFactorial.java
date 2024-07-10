package bucles;
/*En este ejercicio, se pide el cálculo del factorial de un número introducido por el usuario desde
una ventana JOptionPane. El factorial de un número es igual a ese número multiplicado por
todos los que le preceden. Por ejemplo, el factorial de 5 es igual a 5x4x3x2x1, es decir, 120. */
import javax.swing.JOptionPane;

public class BucleFactorial {
public static void main(String[] args) {
    int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número"));
    long factorial=numero;

    for (int i = numero-1; i >0; i--) {
        factorial=factorial*i;
    }
    System.out.println("El factorial del número "+numero+" es: "+factorial);
}
}
