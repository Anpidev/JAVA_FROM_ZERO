package condicionales;

import java.util.Scanner;

/**
 * Ejercicio 21 Calcula la nota de un trimestre de la asignatura Programación.
 * El programa pedirá las dos notas que ha sacado el alumno en los dos primeros
 * controles. Si la media de los dos controles da un número mayor o igual a 5,
 * el alumno está aprobado y se mostrará la media. En caso de que la media sea
 * un número menor que 5, el alumno habrá tenido que hacer el examen de
 * recuperación que se califica como apto o no apto, por tanto se debe preguntar
 * al usuario ¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si
 * el resultado de la recuperación es apto, la nota será un 5; en caso
 * contrario, se mantiene la nota media anterior.
 *
 * @author angelaruiz
 */
public class Condicionales21 {

  public static void main(String[] args) {
    System.out.println("Nota de programación de este trimestre");
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese la nota del primer control");
    double control1 = sc.nextDouble();
    System.out.println("Ingrese la nota del segundo control");
    double control2 = sc.nextDouble();
    sc.nextLine();// MUY IMPORTANTE VACIAR EL BUFFER DE SCANNER DESPUES DE DOUBLE O INT Y ANTES DE
                  // STRING
    double media = (control1 + control2) / 2;

    if (media < 5) {
      System.out.println("¿Cual ha sido el resultado de su recuperación?");
      String recuperacion = sc.nextLine();
      sc.close();
      if (recuperacion.equals("apto")) {
        media = 5;
      }
    }
    System.out.printf("Su nota media ha sido %.1f", media);

  }
}
