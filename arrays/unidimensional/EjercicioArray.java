package arrays.unidimensional;

import java.util.Scanner;

/**
 * EjercicioArray
 * En este ejercicio se pide al usuario que introduzca 10 números enteros por consola. Los números
introducidos se almacenarán en un array. El programa imprime en consola cuántos números
negativos, positivos y valores 0 hay en el array.
 */
public class EjercicioArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros []= new int[10];
        int positivos=0;
        int negativos=0;
        int ceros=0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduzca un número entero");
            numeros[i]=sc.nextInt();
            if (numeros[i]>0) {
                positivos++;
            } else if (numeros[i]<0) {
                negativos++;
                
            }else {
                ceros++;
            }
        }

        sc.close();

        System.out.println("Los números positivos introducidos son "+positivos+
        " los negativos son "+ negativos + " y los ceros "+ceros);
    }
}