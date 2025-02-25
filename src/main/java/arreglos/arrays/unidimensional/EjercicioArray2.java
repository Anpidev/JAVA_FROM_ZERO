package arrays.unidimensional;
/*En este ejercicio, se pide al usuario que introduzca 10 números enteros por consola. Los
números se almacenarán en un array y el programa calculará la media de los números
introducidos en las posiciones pares del array. (Debes utilizar el operador módulo “%”). */

import java.util.Scanner;

public class EjercicioArray2 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int numeros []= new int[10];
        int pares=0;
        int suma=0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduzca un número entero");
            numeros[i]=sc.nextInt();
            if (i%2==0){
                pares++;
                suma+=numeros[i];
            }
        }

        sc.close();
        double media=(double)suma/pares;
        System.out.println("La media de los números introducidos en posiciones pares es: "+media);
}
}
