package basico.condicionales;

import java.util.Scanner;

/**
 * Escribe un programa que calcule el precio final de un producto según su base
 * imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
 * reducido o superreducido) y el código promocional. Los tipos de IVA general,
 * reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
 * promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
 * respectivamente que no se aplica promoción, el precio se reduce a la mitad,
 * se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si
 * se muestran los valores correctos, aunque los números no estén tabulados.
 *
 * @author angelaruiz
 */
public class Condicionales23 {

  public static void main(String[] args) throws Exception {

    // Inicializacion de datos pedidos por pantalla y declaración
    Scanner sc = new Scanner(System.in);
    System.out.println("Calculadora de IVA");
    System.out.println("Ingrese la base imponible del producto");
    double base = sc.nextDouble();
    sc.nextLine(); // VACIAR BUFFER
    System.out.println("Tipo de IVA aplicado: general, reducido, superreducido");
    String IvaAplicado = sc.nextLine();
    System.out.println("Código promocional: nopro, mitad, meno5, 5porc");
    String codigo = sc.nextLine();
    sc.close();

    // Inicialización de datos
    double baseIva;
    double resultado;
    double iva;
    double promo;
    String porcentaje;

    // Ejecución
    switch (IvaAplicado) {
      case "general":
        porcentaje = "21%";
        iva = (base * 21) / 100;
        baseIva = base + iva;
        break;
      case "reducido":
        porcentaje = "10%";
        iva = (base * 10) / 100;
        baseIva = base + iva;
        break;
      case "superreducido":
        porcentaje = "4%";
        iva = (base * 4) / 100;
        baseIva = base + iva;
        break;
      default:
        throw new Exception("Iva mal introducido");
    }
    switch (codigo) {
      case "nopro":
        promo = 0;
        resultado = baseIva;
        break;
      case "mitad":
        promo = baseIva / 2;
        resultado = baseIva - promo;
        break;
      case "meno5":
        promo = -5;
        resultado = baseIva - promo;
        break;
      case "5porc":
        promo = (baseIva * 5) / 100;
        resultado = baseIva - promo;
        break;
      default:
        throw new Exception("Código mal introducido");
    }

    // Resultados
    System.out.printf("Base imponible       %6.2f%n", base);
    System.out.printf("IVA (%2s)            %6.2f%n", porcentaje, iva);
    System.out.printf("Precio con IVA       %6.2f%n", baseIva);
    System.out.printf("Cód. promo. (%5s) -%6.2f%n", codigo, promo);
    System.out.printf("TOTAL                %6.2f", resultado);

  }

}
