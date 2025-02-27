package arrays.unidimensional;

import java.util.Scanner;

/*
 * Ejercicio 16
Escribe un programa que rellene un array de 20 elementos con números enteros
aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación el
programa mostrará el array y preguntará si el usuario quiere resaltar los
múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el array
escribiendo los números que se quieren resaltar entre corchetes.
 */
public class Array16 {
   public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int numeros []= new int[20];
    boolean correcto = false;
    for (int i = 0; i < 20; i++) {
        numeros[i] = (int) (Math.random() * 401);
    }
    for (int i = 0; i < 20; i++) {
        System.out.print(numeros[i] + " ");
    }
    while(!correcto){
        
    
    try {
        System.out.println("\n¿Quiere resaltar los múltiplos de 5 o los múltiplos de 7?"+
        "\n 1- Multiplos de 5 \n 2- Multiplos de 7 \n");
        int resaltar=sc.nextInt();
        switch (resaltar) {
            case 5:
            correcto=true;
            for (int j = 0; j <20; j++) {
                if (numeros[j]%5==0) {
                    System.out.printf("[%d] ",numeros[j]); 
                } else{
                    System.out.print(numeros[j] + " ");}
            }
                break;
                case 7:
                correcto=true;
                for (int j = 0; j <20; j++) {
                    if (numeros[j]%7==0) {
                        System.out.printf("[%d] ",numeros[j]); 
                    } else{
                        System.out.print(numeros[j] + " ");}}
                break;
        
            default:
            System.out.println("\nDebe elegir entre 5 o 7");
                break;
        }
        
    } catch (Exception e) {
        System.out.println("Elección no válida");
        sc.next();
    }
}
    sc.close();
   } 
}
