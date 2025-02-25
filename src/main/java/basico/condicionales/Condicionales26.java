package basico.condicionales;

import java.util.Scanner;

/**
 * Realiza un programa que calcule el precio de unas entradas de cine en función
 * del número de personas y del día de la semana. El precio base de una entrada
 * son 8 euros. El miércoles (día del espectador), el precio base es de 5 euros.
 * Los jueves son el día de la pareja, por lo que la entrada para dos cuesta 11
 * euros. Con la tarjeta CineCampa se obtiene un 10% de descuento. Si un jueves,
 * un grupo de 6 personas compran entradas, el precio total sería de 33 euros ya
 * que son 3 parejas; pero si es un grupo de 7, pagarán 3 entradas de pareja más
 * 1 individual que son 41 euros (33 + 8).
 *
 * @author angelaruiz
 */
public class Condicionales26 {

  public static void main(String[] args) throws Exception {

    // DECLARACION E INICIALIZACION DE VARIABLES
    System.out.println("Venta de entradas CineCampa");
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el número de entradas");
    int numero = sc.nextInt();
    sc.nextLine();
    System.out.println("Ingrese dia de la semana de lunes a domingo");
    String dia = sc.nextLine();
    System.out.println("¿Dispone de la tarjeta CineCampa? (S/N)");
    String tarjeta = sc.nextLine();
    sc.close();

    int base = 8;
    int pareja = 0;
    int individual = 0;
    double descuento = 0;
    double total;
    int entrada;

    // EJECUCION
    switch (dia) {
      case "lunes":
        break;
      case "martes":
        break;
      case "miercoles":
      case "miércoles":
        base = 5;
        break;
      case "jueves":
        pareja = numero / 2;
        individual = numero % 2;
        break;
      default:
        break;
    }
    entrada = (base * individual) + (11 * pareja);

    if (tarjeta.equalsIgnoreCase("S")) {
      descuento = (entrada * 0.1);
    }

    total = entrada - descuento;

    // RESULTADOS
    System.out.println("%nAquí tiene sus entradas. Gracias por su compra.");

    if (pareja > 0) {
      System.out.printf("Entradas de pareja %2d%n", pareja);
      System.out.printf("Precio por entrada de pareja  %5.2f €%n", 11.0);
    }

    if (individual > 0) {
      System.out.printf("Entradas individuales  %2d%n", individual);
      System.out.printf("Precio por entrada individual %5d €%n", base);
    }

    System.out.printf("Total  %5d €%n", entrada);
    System.out.printf("Descuento %5.2f €%n", descuento);
    System.out.printf("A pagar %5.2f €%n", total);

  }

}
