package basico.condicionales;

import java.util.Scanner;

/**
 * Realiza un programa que calcule el precio de un desayuno. El programa
 * preguntará primero qué ha tomado el usuario de comer: palmera, donut o
 * pitufo. La palmera vale 1.40 € y el donut 1 €. En caso de tomar pitufo, el
 * programa debe preguntar además si era con aceite o con tortilla; el primero
 * vale 1’20 € y el segundo 1’60 €. Por último se pregunta por la bebida: zumo o
 * café a 1’50 y 1’20 respectivamente.
 *
 * @author angelaruiz
 */
public class Condicionales29 {

  @SuppressWarnings("resource")
  public static void main(String[] args) {
    System.out.println("PRECIO DE SU DESAYUNO");
    Scanner sc = new Scanner(System.in);
    System.out.println("¿Qué ha tomado de comer: palmera, donut o pitufo?");
    String comida = sc.nextLine().toLowerCase();
    System.out.println("¿Qué bebida desea tomar: zumo o café?");
    String bebida = sc.nextLine().toLowerCase();

    double precioComida = 0;
    double precioBebida = 0;
    double total;

    switch (comida) {
      case "palmera":
        precioComida = 1.40;
        break;
      case "donut":
        precioComida = 1;
        break;
      case "pitufo":
        System.out.println("¿Pitufo : aceite/tortilla?");
        String pitufo = sc.nextLine().toLowerCase();

        if (pitufo.equals("aceite")) {
          precioComida = 1.20;
        } else if (pitufo.equals("tortilla")) {
          precioComida = 1.60;
        } else {
          System.out.println("Error en selección de pitufo");
        }
        break;
      default:
        throw new AssertionError("Error de selección");

    }
    if (bebida.equals("zumo")) {
      precioBebida = 1.50;
    } else if ((bebida.equals("café")) || (bebida.equals("cafe"))) {
      precioBebida = 1.20;
    } else {
      System.out.println("Error en selección de bebida");
    }
    total = precioComida + precioBebida;

    System.out.printf("Su comida elegida es %s y el precio de la comida es %.2f%n"
        + "Su bebida elegida es %s y el precio de la bebida es %.2f%n"
        + "El total es %.2f", comida, precioComida, bebida, precioBebida, total);

    sc.close();
  }
}
