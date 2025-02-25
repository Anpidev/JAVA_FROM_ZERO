package condicionales;

import java.util.Scanner;

/**
 * Ejercicio 3
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspon-
 * diente nombre del día de la semana.
 * 
 * @author angelaruiz
 */
public class Condicionales3 {
  public static void main(String[] args) {
    System.out.println("Ingrese un numero del 1 al 7");
    Scanner sc = new Scanner(System.in);
    int dia = sc.nextInt();
    switch (dia) {
      case 1:
        System.out.println("Es lunes");
        break;
      case 2:
        System.out.println("Es martes");
        break;
      case 3:
        System.out.println("Es miércoles");
        break;
      case 4:
        System.out.println("Es jueves");
        break;
      case 5:
        System.out.println("Es viernes");
        break;
      case 6:
        System.out.println("Es sabado");
        break;
      case 7:
        System.out.println("Es domingo");
        break;

      default:
        System.out.println("Día erróneo");
    }
    sc.close();
  }

}
