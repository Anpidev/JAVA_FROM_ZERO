package basico.bucles;

import java.util.Scanner;

/**
 * Realiza un programa que pinte un triángulo relleno tal como se muestra en los
 * ejemplos. El usuario debe introducir la altura de la figura.
 *
 * @author angelaruiz
 */
public class Bucles53 {

    public static void main(String[] args) {
        System.out.println("Pintemos un triángulo invertido");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la altura de la figura");
        int alturaIntroducida = sc.nextInt();
        sc.close();

        for (int i = 0; i < alturaIntroducida; i++) {

            // Imprimir asteriscos
            for (int j = 0; j < alturaIntroducida - i; j++) {
                System.out.print("* ");
            }

            // Cambiar de línea después de imprimir la fila
            System.out.println();
        }
    }
}
