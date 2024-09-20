package bucles;

import java.util.Scanner;

/**
 * Ejercicio 14 Escribe un programa que pida una base y un exponente (entero
 * positivo) y que calcule la potencia.
 *
 * @author angelaruiz
 */
public
        class Bucles14 {

  public static
          void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("CALCULADORA DE POTENCIA");
    System.out.println("Ingrese la base de la potencia");
    int base = sc.nextInt();
    System.out.println("Ingrese el exponente de la potencia");
    int exponente = sc.nextInt();
    sc.close();
    int contador = 1;
    double resultado = base;

    do {
      if (exponente > 0) {
        resultado = resultado * base;
        contador++;
      }
      if (exponente == 0) {
        resultado = 1;
      }
      if (exponente < 0) {
        resultado *= base;//ES LO MISMO QUE RESULTADO= RESULTADO*BASE
        contador++;
        resultado = 1 / resultado;
      }

    }

    while (contador < exponente);
    System.out.println("El resultado de la potencia es:");
    System.out.println(resultado);

  }

}
