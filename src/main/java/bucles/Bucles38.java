package bucles;

import java.util.Scanner;

/**
 * Ejercicio 38 Realiza un programa que pinte un reloj de arena relleno hecho de
 * asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
 * sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
 * mensaje de error. Ejemplo:
 *
 * @author angelaruiz
 */
public class Bucles38 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pintemos un reloj de arena hecho de asteriscos");
        System.out.println("Ingrese un número entero para la altura");
        int altura = sc.nextInt();
        sc.close();

        if (altura % 2 != 0 && altura >= 3) {
            int mitad = (altura - 1) / 2;

            for (int i = 0; i < mitad; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }

                for (int k = 0; k < altura - 2 * i; k++) {
                    System.out.print("*");
                }

                System.out.println();
            }

            for (int i = 0; i <= mitad; i++) {
                for (int j = 0; j < mitad - i; j++) {
                    System.out.print(" ");
                }

                for (int k = 0; k < 2 * i + 1; k++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        } else {
            System.out.println("Altura errónea, debe ser un número entero impar y mayor o igual a 3");
        }
    }
}
