package arrays.unidimensional;
import java.util.Scanner;
/*
 * Ejercicio 19
Realiza un programa que sea capaz de insertar un número en una posición
concreta de un array. En primer lugar, el programa generará un array de 12
números enteros aleatorios entre 0 y 200 ambos incluidos. A continuación se
debe mostrar el contenido de ese array junto al índice (0 – 11). Seguidamente
el programa preguntará por el número que se quiere insertar y por la posición
donde será insertado. Los números del array se desplazan a la derecha para
dejar sitio al nuevo. El último número (el que se encuentra en la posición 11)
siempre se perderá.
 */
public class Array19 {
    public static void main(String[] args) {
        //Declaracion objeto scanner
        Scanner sc = new Scanner(System.in);
        //Array original
        int original[ ] = new int[ 12 ];
        //Array final
        int resultado [] = new int[ 12 ];


        //Recorrido del array 
        for (int i = 0; i < original.length; i++) {
            original[i]= (int) (Math.random() * 201);
            System.out.println("Posición " + i + ": " + original[i]);
        }
        //Preguntamos posicion inicial a tomar y final.
        System.out.println("Ingrese el valor  que quiere insertar");
        int valor = sc.nextInt();
        System.out.println("Ingrese la posicion dónde insertar el valor");
        int lugar = sc.nextInt();

        //Modificacion del array
        for (int i = 0; i < resultado.length; i++) {
            if (i==lugar) {
                resultado[i] = valor;
            }
            else if (i>lugar) {
                resultado[i] = original[i-1];
                
            }else{
                resultado[i] = original[i];
            }
            System.out.println("Posición " + i + ": " + resultado[i]);
        }
    }
}
