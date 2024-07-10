package condicionales;

import java.util.Scanner;

/**
 * Ejercicio 15 Escribe un programa que pinte una pirámide rellena con un
 * carácter introducido por teclado que podrá ser una letra, un número o un
 * símbolo como *, +, -, $, &, etc. El programa debe permitir al usuario
 * mediante un menú elegir si el vértice de la pirámide está apuntando hacia
 * arriba, hacia abajo, hacia la izquierda o hacia la derecha.
 *
 * @author angelaruiz
 */
public class Condicionales15 {

  public static void main(String[] args) {
    System.out.println("Vamos a crear una pirámide");
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca el carácter con el que rellenar la pirámide \n"
        + "Puede usar una letra \n"
        + "Puede usar un número \n"
        + "O puede usar símbolos como:  *, +, -, $, &,");
    String relleno = sc.nextLine();

    System.out.println("Ahora elija la dirección donde apuntará el vortice \n"
        + "Marque 1 para apuntar hacia arriba \n"
        + "Marque 2 para apuntar hacia abajo \n"
        + "Marque 3 para apuntar hacia la izquierda \n"
        + "Marque 4 para apuntar hacia la derecha");
    int punta = sc.nextInt();
    sc.close();

    switch (punta) {
      case 1:
        System.out.println("  " + relleno);
        System.out.println(" " + relleno + relleno + relleno);
        System.out.println(relleno + relleno + relleno + relleno + relleno);

        break;

      case 2:
        System.out.println(relleno + relleno + relleno + relleno + relleno);
        System.out.println(" " + relleno + relleno + relleno);
        System.out.println("  " + relleno);
        break;

      case 3:
        System.out.println("    " + relleno);
        System.out.println("  " + relleno + " " + relleno);
        System.out.println(relleno + " " + relleno + " " + relleno);
        System.out.println("  " + relleno + " " + relleno);
        System.out.println("    " + relleno);
        break;

      case 4:
        System.out.println(relleno);
        System.out.println(relleno + " " + relleno);
        System.out.println(relleno + " " + relleno + " " + relleno);
        System.out.println(relleno + " " + relleno);
        System.out.println(relleno);
        break;
      default:
        throw new AssertionError();
    }

  }
}
