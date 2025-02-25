package basico.bucles;

import java.util.Scanner;

/**
 * Ejercicio 19 Realiza un programa que pinte una pirámide por pantalla. La
 * altura se debe pedir por teclado. El carácter con el que se pinta la pirámide
 * también se debe pedir por teclado.
 *
 * @author angelaruiz
 */
public class Bucles19 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("PINTEMOS UNA PIRÄMIDE");
    System.out.println("Introduzca un carácter para pintar la pirámide");
    String pintar = sc.nextLine();
    System.out.println("Introduzca la altura de la pirámide");
    int altura = sc.nextInt();
    sc.close();

    int planta = 1;
    int linea = 1;
    int espacios = altura - 1;
    while (planta <= altura) {

      // inserta espacios
      for (int j = 1; j <= espacios; j++) {
        System.out.print(" ");
      }

      // pinta la línea
      for (int i = 1; i <= linea; i++) {
        System.out.print(pintar);

      }
      System.out.println();

      planta++;
      espacios--;
      linea += 2;

    }
  }

}
