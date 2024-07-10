package bucles;

import java.util.Scanner;

/**
 * Ejercicio 69 Realiza un programa que pinte una pirámide maya. Por los lados,
 * se trata de una pirámide normal y corriente. Por el centro se van pintando
 * líneas de asteriscos de forma alterna (empezando por la superior): la primera
 * se pinta, la segunda no, la tercera sí, la cuarta no, etc. La terraza de la
 * pirámide siempre tiene 6 asteriscos, por tanto, las líneas centrales que se
 * añaden a la pirámide normal tienen 4 asteriscos. El programa pedirá la
 * altura. Se supone que el usuario introducirá un número entero mayor o igual a
 * 3; no es necesario comprobar los datos de entrada.
 *
 * @author angelaruiz
 */
public class Bucles69 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Paso 1: Solicitar la altura de la pirámide maya al usuario
        System.out.print("Introduzca la altura de la pirámide maya: ");
        int alturaIntroducida = sc.nextInt();

        // Inicialización de variables
        int planta = 1;
        int longitudDeLinea = 1;
        int espacios = alturaIntroducida - 1;

        // Paso 2: Bucle principal para construir la pirámide maya
        while (planta <= alturaIntroducida) {

            // Paso 3: Imprimir espacios en la parte izquierda
            for (int i = 1; i <= espacios; i++) {
                System.out.print(' ');
            }

            // Paso 4: Imprimir asteriscos en la parte izquierda
            for (int i = 0; i <= longitudDeLinea / 2; i++) {
                System.out.print('*');
            }

            // Paso 5: Imprimir el centro (asteriscos o espacios) (CONDICION TERNARIA)
            System.out.print(planta % 2 == 1 ? "****" : "    ");

            // Paso 6: Imprimir asteriscos en la parte derecha
            for (int i = 0; i <= longitudDeLinea / 2; i++) {
                System.out.print('*');
            }

            // Paso 7: Salto de línea para pasar a la siguiente fila
            System.out.println();

            // Paso 8: Actualizar variables para la siguiente planta
            planta++;
            espacios--;
            longitudDeLinea += 2;
        }

        // Cierre del objeto Scanner
        sc.close();
    }
}
