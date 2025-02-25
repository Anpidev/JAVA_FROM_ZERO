package numeros_aleatorios;

/**
 * Ejercicio 4
 * Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separa-
 * dos por espacios.
 * 
 * @author angelaruiz
 */
public class Num4 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            int numero = (int) (Math.random() * 11);
            System.out.print(numero + " ");

        }
    }

}
