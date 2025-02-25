package basico.condicionales;

import java.util.Scanner;

/**
 * Ejercicio 13
 * Escribe un programa que ordene tres números enteros introducidos por teclado.
 * 
 * @author angelaruiz
 */
public class Condicionales13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un primer número entero");
    int num1 = sc.nextInt();
    System.out.println("Introduce un segundo número entero");
    int num2 = sc.nextInt();
    System.out.println("Introduce el tercer número entero");
    int num3 = sc.nextInt();

    if (num1 > num2) {
      num1 = num1 + num2;
      num2 = num1 - num2;
      num1 = num1 - num2;
    }

    if (num2 > num3) {
      num2 = num2 + num3;
      num3 = num2 - num3;
      num2 = num2 - num3;
    }

    if (num1 > num2) {
      num1 = num1 + num2;
      num2 = num1 - num2;
      num1 = num1 - num2;
    }
    System.out.println("Los numeros introducidos son: " + num1 + " " + num2 + " " + num3);
    sc.close();
  }

}
