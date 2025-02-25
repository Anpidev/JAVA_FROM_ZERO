package condicionales;

import java.util.Scanner;

/**
 * Ejercicio 10
 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de
 * nacimiento.
 * 
 * @author angelaruiz
 */
public class Condicionales10 {
  public static void main(String[] args) {
    System.out.println("Adivina tu horóscopo");
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca el día de su nacimiento(1-31)");
    int dia = sc.nextInt();
    System.out.println("Introduzca el mes de su nacimiento(1-12)");
    int mes = sc.nextInt();

    if (dia >= 21 && mes == 3 || dia <= 19 && mes == 4) {
      System.out.println("Eres Aries");
    } else if (dia >= 20 && mes == 4 || dia <= 20 && mes == 5) {
      System.out.println("Eres Tauro");

    } else if (dia >= 21 && mes == 5 || dia <= 20 && mes == 6) {
      System.out.println("Eres Géminis");
    }

    else if (dia >= 21 && mes == 6 || dia <= 22 && mes == 7) {
      System.out.println("Eres Cáncer");
    }

    else if (dia >= 23 && mes == 7 || dia <= 22 && mes == 8) {
      System.out.println("Eres Leo");
    }

    else if (dia >= 23 && mes == 8 || dia <= 22 && mes == 9) {
      System.out.println("Eres Virgo");
    }

    else if (dia >= 23 && mes == 9 || dia <= 22 && mes == 10) {
      System.out.println("Eres Libra");
    }

    else if (dia >= 23 && mes == 10 || dia <= 21 && mes == 11) {
      System.out.println("Eres Escorpio");
    }

    else if (dia >= 22 && mes == 11 || dia <= 21 && mes == 12) {
      System.out.println("Eres Sagitario");
    }

    else if (dia >= 22 && mes == 12 || dia <= 20 && mes == 1) {
      System.out.println("Eres Capricornio");
    }

    else if (dia >= 21 && mes == 1 || dia <= 19 && mes == 2) {
      System.out.println("Eres Acuario");
    }

    else if (dia >= 20 && mes == 2 || dia <= 20 && mes == 3) {
      System.out.println("Eres Piscis");
    }

    else {
      System.out.println("Error, datos mal introducidos");
    }
    sc.close();

  }

}
