package basico.condicionales;

import java.util.Scanner;

/**
 * Ejercicio 1
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
 * asignatura toca a primera hora ese día.
 * 
 * @author angelaruiz
 */
public class Condicionales1 {
  public static void main(String[] args) {
    /**
     * System.out.println("Ingrese un dia de la semana en números : siendo 1 lunes y
     * 5 viernes");
     * Scanner sc = new Scanner(System.in);
     * 
     * 
     * Primera forma de resolución con switch
     * int dia=sc.nextInt();
     * 
     * switch (dia) {
     * case 1:
     * System.out.println("A primera hora toca mates");
     * break;
     * case 2:
     * System.out.println("A primera hora toca física");
     * break;
     * case 3:
     * System.out.println("A primera hora toca inglés");
     * break;
     * case 4:
     * System.out.println("A primera hora toca biología");
     * break;
     * case 5:
     * System.out.println("A primera hora toca química");
     * break;
     * 
     * default:
     * System.out.println("El día introducido no es correcto");
     * }
     */
    System.out.println("Ingrese un día de lunes a viernes");
    Scanner sc = new Scanner(System.in);
    String dia = sc.nextLine();
    if (dia.equals("lunes")) {
      System.out.println("A primera hora toca mates");
    } else if (dia.equals("martes")) {
      System.out.println("A primera hora toca física");
    } else if (dia.equals("miércoles")) {
      System.out.println("A primera hora toca ingles");
    } else if (dia.equals("jueves")) {
      System.out.println("A primera hora toca biología");
    } else if (dia.equals("viernes")) {
      System.out.println("A primera hora toca química");
    } else {
      System.out.println("El día introducido no es correcto");
    }
    sc.close();
  }
}
