package condicionales;

import java.util.Scanner;

/**
 * Ejercicio 9 Realiza un programa que resuelva una ecuación de segundo grado
 * (del tipo ax2 + bx + c = 0).
 *
 * @author angelaruiz
 */
public class Condicionales9 {

  public static void main(String[] args) {
    double x1, x2;
    // La solución de una ecuacion de segundo grado es x= (-b + o - raiz cuadrada de
    // (b al cuadrado + 4ac))/2a

    System.out.println("Este programa resuelve ecuaciones de segundo grado.");
    System.out.println("ax^2 + bx + c = 0");

    System.out.println("Por favor, introduzca los valores.");
    Scanner sc = new Scanner(System.in);

    System.out.print("a = ");
    double a = sc.nextDouble();

    System.out.print("b = ");
    double b = sc.nextDouble();

    System.out.print("c = ");
    double c = sc.nextDouble();

    // Math.pow(b,2) es lo mismo que b*b
    double discriminante = Math.pow(b, 2) - (4 * a * c);

    if (discriminante < 0) {
      System.out.println("La ecuacion no tiene solución");
    }

    if (discriminante == 0) {
      System.out.println("La ecuacion tiene infinitas soluciones");
    }

    if (discriminante > 0) {
      System.out.println("La ecuación tiene dos posibles soluciones x1 y x2");
      x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
      System.out.println("x1 = " + x1);
      x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
      System.out.println("x2 = " + x2);
    }
    sc.close();
  }
}
