package basico.condicionales;

import java.util.Scanner;

/**
 * Ejercicio 22 Realiza un programa que, dado un día de la semana (de lunes a
 * viernes) y una hora (horas y minutos), calcule cuántos minutos faltan para el
 * fin de semana. Se considerará que el fin de semana comienza el viernes a las
 * 15:00h. Se da por hecho que el usuario introducirá un día y hora correctos,
 * anterior al viernes a las 15:00h.
 *
 * @author angelaruiz
 */
public class Condicionales22 {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese un dia de la semana de lunes a viernes");
    String dia = sc.nextLine();
    System.out.println("Ingrese una hora (formato 24 horas)");
    int hora = sc.nextInt();
    System.out.println("Ingrese los minutos");
    int minutos = sc.nextInt();
    sc.close();

    // Seleccionador de dia
    int diaElegido = 0;

    switch (dia) {
      case "lunes":
        diaElegido = 0;

        break;
      case "martes":
        diaElegido = 1;

        break;
      case "miércoles":
      case "miercoles":
        diaElegido = 2;
        break;
      case "jueves":
        diaElegido = 3;
        break;
      case "viernes":
        diaElegido = 4;
        break;
      default:

        throw new Exception("Dia mal introducido");
    }

    // Fin de semana igual a viernes a las 15:00
    int finSemana = (4 * 24 * 60) + (15 * 60);

    // Dia , hora y minutos introducidos pasados a minutos totalas
    int minActual = (diaElegido * 24 * 60) + (hora * 60) + (minutos);

    // Calculo final de minutos restantes y solución
    int minRestantes = finSemana - minActual;
    if (minRestantes > 0) {
      System.out.printf("Faltan %d minutos para el fin de semana", minRestantes);
    }
    if (minRestantes <= 0) {
      System.out.println("Ya es fin de semana");
    }
  }

}
