package basico.bucles;

import java.util.Scanner;

/**
 * Ejercicio 25 Realiza un programa que pida un número por teclado y que luego
 * muestre ese número al revés.
 *
 * @author angelaruiz
 */
public class Bucles25 {

  public static void main(String[] args) {
    System.out.println("Ingrese un número por teclado, mínimo de dos cifras");
    Scanner sc = new Scanner(System.in);
    int numero = sc.nextInt();
    sc.close();

    int numReverso = 0;

    for (int cifras = numero; cifras > 0; cifras /= 10) {
      int ultimoDigito = cifras % 10;
      numReverso = numReverso * 10 + ultimoDigito;
    }

    System.out.println("El número al revés es: " + numReverso);
  }
}
