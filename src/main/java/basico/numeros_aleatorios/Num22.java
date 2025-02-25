package numeros_aleatorios;

import java.util.Scanner;

/**
 * Ejercicio 22 Realiza un programa que pinte por pantalla una serpiente con un
 * “serpenteo” aleatorio. La cabeza se representará con el carácter @ y se debe
 * colocar exactamente en la posición 13 (con 12 espacios delante). A partir de
 * ahí, el cuerpo irá serpenteando de la siguiente manera: se generará de forma
 * aleatoria un valor entre tres posibles que hará que el siguiente carácter se
 * coloque una posición a la izquierda del anterior, alineado con el anterior o
 * una posición a la derecha del anterior. La longitud de la serpiente se pedirá
 * por teclado y se supone que el usuario introducirá un dato correcto. Ejemplo:
 * Por favor, introduzca la longitud de la serpiente en caracteres contando la
 * cabeza: 6
 *
 * @author angelaruiz
 */
public class Num22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, introduzca la longitud de la serpiente"
                + "contando la cabeza (máximo 25)");

        int longitud = sc.nextInt();
        sc.close();

        if (longitud <= 25) {
            // Pinta la cabeza
            System.out.println("\n            @");

            // Pinta el cuerpo
            int x = 13;

            for (int i = 0; i < longitud - 1; i++) {
                // Genera un movimiento aleatorio de -1, 0 o 1
                int movimiento = (int) (Math.random() * 3) - 1;

                // Actualiza la posición x asegurándose de no salir de los límites de la
                // pantalla
                x = Math.max(1, Math.min(x + movimiento, 25));

                // Pinta espacios hasta llegar a la posición x
                for (int j = 1; j < x; j++) {
                    System.out.print(" ");
                }

                // Pinta el cuerpo
                System.out.println("#");
            }

        } else {
            System.out.println("Longitud mayor de 25");
        }
    }
}
