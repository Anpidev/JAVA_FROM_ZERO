package bucles;

import java.util.Scanner;

/**
 * Ejercicio 17 Realiza un programa que sume los 100 números siguientes a un
 * número entero y positivo introducido por teclado. Se debe comprobar que el
 * dato introducido es correcto (que es un número positivo).
 *
 * @author angelaruiz
 */
public class Bucles17 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un número entero y positivo");
    int num = sc.nextInt();
    sc.close();
    int suma = 0;

    if (num >= 0) {
      for (int i = num; i < (num + 100); i++) {
        suma += i;
      }

    } else {
      System.out.println("Número erróneo");
    }
    System.out.printf("La suma de los cien siguientes números tras %d es: %d", num, suma);
  }

}
