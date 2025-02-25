package basico.condicionales;

import java.util.Scanner;

/**
 * Una pastelería nos ha pedido realizar un programa que haga presupuestos de
 * tartas. El programa preguntará primero de qué sabor quiere el usuario la
 * tarta: manzana, fresa o chocolate. La tarta de manzana vale 18 euros y la de
 * fresa 16. En caso de seleccionar la tarta de chocolate, el programa debe
 * preguntar además si el chocolate es negro o blanco; la primera opción vale 14
 * euros y la segunda 15. Por último se pregunta si se añade nata y si se
 * personaliza con un nombre; la nata suma 2.50 y la escritura del nombre 2.75.
 *
 * @author angelaruiz
 */
public class Condicionales27 {

  public static void main(String[] args) {
    System.out.println("Pasteleria: SUS PASTELES.\n Haga su pedido\n");

    // DECLARACION VARIABLES E INICIALIZACION
    double precioSabor = 0;
    double precioNata = 0;
    double precioNombre = 0;
    double total = 0;

    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el sabor de la tarta");
    String sabor = sc.nextLine();
    System.out.println("¿Quiere nata? (si o no)");
    String nata = sc.nextLine();
    System.out.println("¿Quiere personalizarla con un nombre?(si o no)");
    String nombre = sc.nextLine();

    // EJECUCION
    switch (sabor) {
      case "manzana":
        precioSabor = 18;
        System.out.println("Tarta sabor manzana : 18 euros");
        break;
      case "fresa":
        precioSabor = 16;
        System.out.println("Tarta sabor fresa: 16 euros");
        break;
      case "chocolate":
        System.out.println("¿Quiere chocolate blanco o negro?");
        String chocolate = sc.nextLine();
        sc.close();
        if (chocolate.equalsIgnoreCase("blanco")) {
          precioSabor = 15;
          System.out.println("Tarta sabor chocolate blanco: 15 euros");
        }
        if (chocolate.equalsIgnoreCase("negro")) {
          precioSabor = 14;
          System.out.println("Tarta sabor chocolate negro: 14 euros");
        }

        break;
      default:
        break;
    }

    if (nata.equalsIgnoreCase("si")) {
      precioNata = 2.50;
      System.out.println("Tarta con nata: 2,50 euros");
    }
    if (nombre.equalsIgnoreCase("si")) {
      precioNombre = 2.75;
      System.out.println("Tarta con nombre: 2,75 euros");

    }
    total = precioSabor + precioNata + precioNombre;

    // RESULTADO
    System.out.println("El total es: " + total);

  }
}
