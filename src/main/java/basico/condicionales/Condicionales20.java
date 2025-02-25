package condicionales;

import java.util.Scanner;

/**
 * Ejercicio 20 Realiza un programa que diga si un número entero positivo
 * introducido por teclado es capicúa. Se permiten números de hasta 5 cifras.
 *
 * @author angelaruiz
 */
public class Condicionales20 {

  public static void main(String[] args) {

    boolean capicua = false;
    System.out.println("Ingrese un numero entero positivo de hasta cinco cifras");
    Scanner sc = new Scanner(System.in);
    int numero = sc.nextInt();
    sc.close();

    // número de una cifra
    if (numero < 10) {
      capicua = true;
    }

    // número de dos cifras
    if ((numero >= 10) && (numero < 100)) {
      if ((numero / 10) == (numero % 10)) {
        capicua = true;
      }
    }

    // número de tres cifras
    if ((numero >= 100) && (numero < 1000)) {
      if ((numero / 100) == (numero % 10)) {
        capicua = true;
      }
    }

    // número de cuatro cifras
    if ((numero >= 1000) && (numero < 10000)) {
      if (((numero / 1000) == (numero % 10)) && (((numero / 100) % 10) == ((numero / 10) % 10))) {
        capicua = true;
      }
    }

    // número de cinco cifras
    if (numero >= 10000) {
      if (((numero / 10000) == (numero % 10)) && ((((numero / 1000) % 10)) == ((numero / 10) % 10))) {
        capicua = true;
      }
    }

    if (capicua) {
      System.out.println("El número introducido es capicúa.");
    } else {
      System.out.println("El número introducido no es capicúa.");
    }

  }
}
