package condicionales;

import java.util.Scanner;

/**
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
 * las horas extras. Escribe un programa que calcule el salario semanal de un
 * trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
 * trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
 * euros
 * la hora.
 * Ejemplo 1:
 * Por favor, introduzca el número de horas trabajadas durante la semana: 36
 * El sueldo semanal que le corresponde es de 432 euros
 * Ejemplo 2:
 * Por favor, introduzca el número de horas trabajadas durante la semana: 40
 * El sueldo semanal que le corresponde es de 480 euros
 * Ejemplo 3:
 * Por favor, introduzca el número de horas trabajadas durante la semana: 55
 * El sueldo semanal que le corresponde es de 720 euros
 * 
 * @author angelaruiz
 */
public class Condicionales4 {
  public static void main(String[] args) {

    int horasTrabajadas;
    int horasNormales = 40;
    int horasExtra;
    int resultado;

    System.out.println("Ingrese las horas trabajadas");
    Scanner sc = new Scanner(System.in);
    horasTrabajadas = sc.nextInt();
    if (horasTrabajadas <= 40) {
      resultado = horasTrabajadas * 12;
      System.out.println("Su salario es: " + resultado);
    }
    if (horasTrabajadas > 40) {
      horasExtra = horasTrabajadas - 40;
      resultado = horasNormales * 12 + horasExtra * 16;
      System.out.println("Su salario es: " + resultado);
    }
    sc.close();
  }
}
