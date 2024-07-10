package bucles;

import java.util.Scanner;

/**
 * Ejercicio 51 El gusano numérico se come los dígitos con forma de rosquilla, o
 * sea, el 0 y el 8 (todos los que encuentre). Realiza un programa que muestre
 * un número antes y después de haber sido comido por el gusano. Si el animalito
 * no se ha comido ningún dígito, el programa debe indicarlo. Ejemplo 1:
 * Introduzca un número entero (mayor que cero): 51803458 Después de haber sido
 * comido por el gusano numérico se queda en 51345 Ejemplo 2: Introduzca un
 * número entero (mayor que cero): 29614 El gusano numérico no se ha comido
 * ningún dígito.
 *
 * @author angelaruiz
 */
public class Bucles51 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número entero (mayor que cero):");
        int numeroIntroducido = sc.nextInt();

        if (numeroIntroducido > 0) {
            int numero = numeroIntroducido;
            boolean rosquilla = false;
            int nuevoNumero = 0;
            int multiplicador = 1;

            while (numero > 0) {
                int digito = numero % 10;
                if (digito != 8 && digito != 0) {
                    nuevoNumero += digito * multiplicador;
                    multiplicador *= 10;
                } else {
                    rosquilla = true;
                }
                numero /= 10;
            }

            if (rosquilla) {
                System.out.println("Después de haber sido comido por el gusano numérico se queda en " + nuevoNumero);
            } else {
                System.out.println("El gusano numérico no se ha comido ningún dígito.");
            }
        }
        sc.close();
    }
}
