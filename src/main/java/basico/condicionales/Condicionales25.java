package basico.condicionales;

import java.util.Scanner;

/**
 * La tienda online BanderaDeEspaña.es vende banderas personalizadas de la
 * máxima calidad y nos ha pedido hacer un configurador que calcule el precio
 * según el alto y el ancho. El precio base de una bandera es de un céntimo de
 * euro el centímetro cuadrado. Si la queremos con un escudo bordado, el precio
 * se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío
 * son 3.25 €. El IVA ya está incluido en todas las tarifas. Introduzca la
 * altura de la bandera en cm: 20 Ahora introduzca la anchura: 35 ¿Quiere escudo
 * bordado? (s/n): n Gracias. Aquí tiene el desglose de su compra. Bandera de
 * 700 cm2: Sin escudo: 7,00 € 0,00 € Gastos de envío:3,25 € Total:10,25 €
 *
 * @author angelaruiz
 */
public class Condicionales25 {

  public static void main(String[] args) {

    // Declaracion de variables e inicialización
    double centimetro = 0.01;
    double bordado = 2.50;
    double envio = 3.25;
    double bandera;
    double precio;
    double precioBandera = 0;
    double total;
    String banderaEscudo = "";

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca la altura de la bandera en cm");
    double altura = sc.nextDouble();
    System.out.println("Ahora introduzca la anchura en cm");
    double anchura = sc.nextDouble();
    sc.nextLine(); // LIMPIEZA DE BUFFER
    System.out.println("¿Quiere escudo bordado? (s/n)");
    String escudo = sc.nextLine();
    sc.close();

    // Ejecución
    bandera = altura * anchura;
    precio = bandera * centimetro;

    if (escudo.equalsIgnoreCase("s")) {
      banderaEscudo = "Bandera con escudo";
      precioBandera = precio + bordado;

    }
    if (escudo.equalsIgnoreCase("n")) {
      banderaEscudo = "Bandera sin escudo";
      precioBandera = precio;
      bordado = 0;

    }

    total = precioBandera + envio;

    // Resultado
    System.out.println("Gracias. Aquí tiene el desglose de su compra.");
    System.out.printf("Bandera de %.1f cm2: %.1f euros%n", bandera, precio);
    System.out.printf("%s:    %.1f euros%n", banderaEscudo, bordado);
    System.out.println("Gastos de envío:" + envio + " euros");
    System.out.println("Total: " + total + " euros");

  }
}
