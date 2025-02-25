package basico.bucles;

import java.util.Scanner;

/**
 * Ejercicio 68
 * Escribe un programa que pida un número por teclado y que luego lo “dislo-
 * que” de tal forma que a cada dígito se le suma 1 si es par y se le resta 1 si
 * es impar. Usa long en lugar de int donde sea necesario para admitir números
 * largos.
 * Ejemplo 1:
 * Por favor, introduzca un número: 9402
 * Dislocando el 9402 sale el 8513.
 * Ejemplo 2:
 * Por favor, introduzca un número: 870958422
 * Dislocando el 870958422 sale el 961849533.
 * Ejemplo 3:
 * Por favor, introduzca un número: 137
 * Dislocando el 137 sale el 26
 * 
 * @author angelaruiz
 */
public class Bucles68 {
    public static void main(String[] args) {

        // PEDIR DATOS POR PANTALLA
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número");
        long numeroIntroducido = sc.nextLong();

        // Declaramos e inicializamos variables para hacer una itirenación por los
        // dígitos
        long numero = numeroIntroducido;
        int digito = 0;
        int divisor = 1;
        long nuevoNumero = 0;

        // Ejecución del código
        while (numero > 0) {
            digito = (int) numero % 10;
            if (digito % 2 == 0) {
                digito = digito + 1;
            } else {
                digito = digito - 1;
            }
            nuevoNumero = nuevoNumero + digito * divisor;
            divisor *= 10;
            numero /= 10;

        }
        System.out.println("Dislocando el " + numeroIntroducido + " sale el " + nuevoNumero);

        // CIERRE DE OBJETO SCANNER PARA OPTIMIZAR RECURSOS
        sc.close();
    }
}
