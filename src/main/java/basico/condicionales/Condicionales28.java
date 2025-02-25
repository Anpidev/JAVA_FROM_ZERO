package basico.condicionales;

import java.util.Scanner;

/**
 * Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce
 * su jugada y luego el usuario 2. Si alguno de los usuarios introduce una
 * opción incorrecta, el programa deberá mostrar un mensaje de error.
 *
 * @author angelaruiz
 */
public class Condicionales28 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese usuario 1 su jugada: piedra, papel o tijeras");
    String usuario1 = sc.nextLine().toLowerCase();

    System.out.println("Ingrese usuario 2 su jugada: piedra, papel o tijeras");
    String usuario2 = sc.nextLine().toLowerCase();

    sc.close();

    String resultado;

    switch (usuario1 + usuario2) {
      case "piedratijeras":
      case "papelpiedra":
      case "tijeraspapel":
        resultado = "Usuario 1 gana";
        break;
      case "tijeraspiedra":
      case "piedrapapel":
      case "papeltijeras":
        resultado = "Usuario 2 gana";
        break;
      case "piedrapiedra":
      case "papelpapel":
      case "tijerastijeras":
        resultado = "Empate";
        break;
      default:
        resultado = "Error: Jugadas no válidas";
        break;
    }

    System.out.println(resultado);
  }
}
