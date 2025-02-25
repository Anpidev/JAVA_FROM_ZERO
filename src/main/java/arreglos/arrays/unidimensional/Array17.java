package arreglos.arrays.unidimensional;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Ejercicio 17
Escribe un programa que muestre por pantalla un array de 10 números enteros
generados al azar entre 0 y 100. A continuación, el programa debe pedir un
número al usuario. Se debe comprobar que el número introducido por teclado
se encuentra dentro del array, en caso contrario se mostrará un mensaje por
pantalla y se volverá a pedir un número; así hasta que el usuario introduzca uno
correctamente. A continuación, el programa rotará el array hacia la derecha
las veces que haga falta hasta que el número introducido quede situado en la
posición 0 del array. Por último, se mostrará el array rotado por pantalla.
 */
public class Array17 {

    public static void main(String[] args) {

        // Creamos el array y lo rellenamos
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * 101);
        }

        // Objeto Scanner y booleanos para comprobación de datos
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;
        boolean noEncuentra = false;

        while (!correcto || !noEncuentra) {
            try {
                // Pedimos por pantalla un número
                System.out.println("Escriba un número entre 0 y 100");
                int numero = sc.nextInt();

                // Comprobación de datos ingresados por pantalla cumple rango
                if (numero >= 0 && numero < 101) {
                    correcto = true;

                    // Comprobamos que el número introducido por teclado se encuentra dentro del
                    // array
                    // En caso de que no se encuentre, se repite el proceso hasta que se encuentre
                    for (int i = 0; i < array.length; i++) {
                        if (array[i] == numero) {
                            noEncuentra = true;

                            // Creamos segundo array para las modificaciones
                            int[] array2 = new int[10];

                            // Rotar el array hacia la derecha hasta que el número esté en la posición 0
                            for (int j = 0; j < array2.length; j++) {
                                array2[j] = array[(i - j + 10) % 10]; // Para evitar indices negativos
                                System.out.print(array2[j] + " ");
                            }
                            break;
                        }
                    }
                    if (!noEncuentra) {
                        System.out.println("El número introducido no se encuentra en el array. Inténtelo de nuevo.");
                    }
                } else {
                    System.out.println("Ha introducido un número incorrecto. Inténtelo de nuevo.");

                }
            } catch (InputMismatchException e) {
                sc.next();
            }
        }
        sc.close();
    }
}
