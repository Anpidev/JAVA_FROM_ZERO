package condicionales;

import java.util.Scanner;

/**
 * *
 * Ejercicio 11
 * Escribe un programa que dada una hora determinada (horas y minutos), calcule
 * los segundos que faltan para llegar a la medianoche.
 * 
 * @author angelaruiz
 */
public class Condicionales11 {
  public static void main(String[] args) {
    // 1 hora son 3600 segundos
    final int MEDIANOCHE = 86400;

    System.out.println("Calcudadora de segundos para la medianoche");

    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese la hora");
    int hora = sc.nextInt();

    System.out.println("Ingrese los minutos");
    int minuto = sc.nextInt();

    if (hora > 0 && hora <= 24) {
      int minutoSegundos = minuto * 60;
      int horaSegundos = hora * 3600;
      int resultado = MEDIANOCHE - (minutoSegundos + horaSegundos);
      System.out.println("Faltan para la medianoche " + resultado + " segundos");
    } else {
      System.out.println("Tiempo mal introducido");
    }

    sc.close();
  }

}
