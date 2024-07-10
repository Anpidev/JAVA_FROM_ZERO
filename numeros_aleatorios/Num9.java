package numeros_aleatorios;

/**
 * Ejercicio 9 Realiza un programa que vaya generando números aleatorios pares
 * entre 0 y 100 y que no termine de generar números hasta que no saque el 24.
 * El programa deberá decir al final cuántos números se han generado.
 *
 * @author angelaruiz
 */
public class Num9 {

    public static void main(String[] args) {
        int numero = 0;
        int contador = 0;

        while (numero != 24) {
            numero = (int) (Math.random() * 100);
            if (numero % 2 == 0 && numero > 0) {
                System.out.println(numero);
                contador++;

            }
        }
        System.out.println("Se han generado " + contador + " números");

    }
}
