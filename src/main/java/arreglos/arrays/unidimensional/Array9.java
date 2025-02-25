package arreglos.arrays.unidimensional;

import java.util.Scanner;

/**
 * Ejercicio 9
 * Realiza un programa que pida 8 números enteros y que luego muestre esos
 * números junto con la palabra “par” o “impar” según proceda.
 */
public class Array9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numero = new int[8];
        String[] par = new String[8];

        for (int i = 0; i < 8; i++) {
            System.out.println("Ingrese un número entero");
            numero[i] = sc.nextInt();
            if (numero[i] % 2 == 0) {
                par[i] = "par";
            } else {
                par[i] = "impar";
            }
        }
        for (int j = 0; j < 8; j++) {
            System.out.print(numero[j] + "-->" + par[j] + " ");
        }

        sc.close();
    }

}