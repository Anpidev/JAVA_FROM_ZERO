package bucles;

import java.util.Scanner;

/**
 * Ejercicio 21 Realiza un programa que vaya pidiendo números hasta que se
 * introduzca un numero negativo y nos diga cuantos números se han introducido,
 * la media de los impares y el mayor de los pares. El número negativo sólo se
 * utiliza para indicar el final de la introducción de datos pero no se incluye
 * en el cómputo.
 *
 * @author angelaruiz
 */
public class Bucles21 {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int numero = 0;
    int maxPar = 0;
    int impares = 0;
    int contador = 0;
    int contadorImpares = 0;
    teclado.close();

    do {
      System.out.println("Introduzca un número( un número negativo cerrará el ciclo)");
      numero = teclado.nextInt();
      contador++;
      if (numero % 2 != 0) {
        impares += numero;
        contadorImpares++;
      } else {
        if (numero > maxPar) {
          maxPar = numero;
        }
      }

    } while (numero > 0);
    int numeroPositivo = contador - 1;
    double media = impares / contadorImpares;

    System.out.printf("Ha introducido %d números positivos%n", numeroPositivo);
    System.out.printf("La media de los impares ha sido %.2f%n", media);
    System.out.printf("El mayor número par introducido ha sido %d%n", maxPar);
  }

}
