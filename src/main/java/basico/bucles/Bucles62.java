package basico.bucles;

import java.util.Scanner;

/**
 * Ejercicio 62 Según cierta cultura oriental, los números de la suerte son el
 * 3, el 7, el 8 y el 9. Los números de la mala suerte son el resto: el 0, el 1,
 * el 2, el 4, el 5 y el 6. Un número es afortunado si contiene más números de
 * la suerte que de la mala suerte. Realiza un programa que diga si un número
 * introducido por el usuario es afortunado o no. Ejemplo 1: Introduzca un
 * número: 772 El 772 es un número afortunado. Ejemplo 2: Introduzca un número:
 * 7720 El 7720 no es un número afortunado. Ejemplo 3: Introduzca un número:
 * 43081 El 43081 no es un número afortunado. Ejemplo 4: Introduzca un número:
 * 888 El 888 es un número afortunado. Ejemplo 5: Introduzca un número: 1234 El
 * 1234 no es un número afortunado. Ejemplo 6: Introduzca un número: 6789 El
 * 6789 es un número afortunado.
 *
 * @author angelaruiz
 */
public class Bucles62 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int numeroIntroducido = sc.nextInt();
        int numero = numeroIntroducido;
        int fortuna = 0;
        int noFortuna = 0;

        while (numero > 0) {
            int digito = numero % 10;
            if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
                fortuna++;

            } else {
                noFortuna++;
            }
            numero /= 10;
        }

        if (fortuna > noFortuna) {
            System.out.println("El " + numeroIntroducido + " es un número afortunado");
        } else {
            System.out.println("El " + numeroIntroducido + " no es un número afortunado");
        }

        sc.close();
    }
}
/**
 * El operador ternario es una forma concisa de expresar una estructura
 * condicional en una sola línea. Su forma general es:
 * 
 * 
 * condicion ? valor_si_cierto : valor_si_falso;
 * Donde:
 * 
 * condicion es la expresión que se evalúa.
 * valor_si_cierto es el valor que se devuelve si la condición es verdadera.
 * valor_si_falso es el valor que se devuelve si la condición es falsa.
 * 
 * System.out.println("El " + numeroIntroducido + (fortuna > noFortuna ? " es un
 * número afortunado" : " no es un número afortunado"));
 * Esta línea se puede entender así:
 * 
 * "El " + numeroIntroducido concatena la parte del mensaje que indica el número
 * introducido.
 * 
 * (fortuna > noFortuna ? " es un número afortunado" : " no es un número
 * afortunado") es la parte del mensaje que se elige de manera condicional.
 * 
 * fortuna > noFortuna: Si la cantidad de números de la suerte (fortuna) es
 * mayor que la cantidad de números de mala suerte (noFortuna), entonces la
 * condición es verdadera.
 * 
 * " es un número afortunado": Si la condición es verdadera, esta parte del
 * mensaje se elige.
 * 
 * : " no es un número afortunado": Si la condición es falsa, esta parte del
 * mensaje se elige.
 * 
 * En resumen, el operador ternario es simplemente una forma abreviada de
 * expresar una estructura if-else en una sola línea. Se puede usar cuando se
 * desea realizar una operación condicional simple de manera más concisa.
 */