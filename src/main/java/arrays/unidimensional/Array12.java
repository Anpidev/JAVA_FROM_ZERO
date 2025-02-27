package arrays.unidimensional;

import java.util.Random;

/**
 * Ejercicio 12
Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
“inicial” y “final”. Se debe comprobar que inicial es menor que final y que ambos
números están entre 0 y 9. El programa deberá colocar el número de la posición
inicial en la posición final, rotando el resto de números para que no se pierda
ninguno. Al final se debe mostrar el array resultante.
Por ejemplo, para inicial = 3 y final = 7:
 */

import java.util.Scanner;

public class Array12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero[] = new int[10];
        int nuevo[] = new int[10];
        int i;

        for (i = 0; i < 10; i++) {
            System.out.println("Ingrese un número entero");
            int entero = sc.nextInt();
            numero[i] = entero;
        }

        for (i = 0; i < 10; i++) {
            System.out.println("----------");
            System.out.print("|" + i + ":");
            System.out.printf("%6d|%n", numero[i]);
            System.out.println("----------");
        }

        boolean error = true;
        do {

            error = false;
            try {
                System.out.println("Ingrese una posición inicial");
                int inicial = sc.nextInt();
                System.out.println("Ingrese una posición final");
                int ultima = sc.nextInt();
                if ((inicial < ultima) && (inicial >= 0 && inicial < 10) && (ultima >= 0 && ultima < 10)) {
                    Random rand = new Random();
                    // Crear un array para llevar registro de los índices usados
                    boolean[] indicesUsados = new boolean[10];
                    indicesUsados[ultima] = true;

                    for (int j = 0; j < 10; j++) {
                        if (j != ultima) {
                            int indiceAleatorio;
                            do {
                                indiceAleatorio = rand.nextInt(10);
                            } while (indicesUsados[indiceAleatorio]
                                    || (j < ultima && nuevo[j] == numero[indiceAleatorio]));
                            nuevo[j] = numero[indiceAleatorio];
                            indicesUsados[indiceAleatorio] = true;
                        }
                    }

                    // Mover el valor de la posición inicial a la posición final
                    nuevo[ultima] = numero[inicial];

                    for (int j = 0; j < 10; j++) {
                        System.out.println("----------");
                        System.out.print("|" + j + ":");
                        System.out.printf("%6d|%n", nuevo[j]);
                        System.out.println("----------");
                    }
                }

            } catch (Exception e) {
                System.out.println("El número inicial debe ser menor que el final."
                        + "Además tienen que ser números entre 0 y 9");
                sc.nextLine();
                error = true;

            }

        } while (error);
        sc.close();
    }
}
