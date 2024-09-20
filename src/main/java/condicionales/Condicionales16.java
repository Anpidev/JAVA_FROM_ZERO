package condicionales;

import java.util.Scanner;

/**
 * Ejercicio 16 Realiza un programa que nos diga si hay probabilidad de que
 * nuestra pareja nos está siendo infiel.
 *
 * @author angelaruiz
 */
public class Condicionales16 {

  public static void main(String[] args) {

    int puntuacion = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("PROGRAMA PILLA INFIDELIDADES");

    System.out.println("Pregunta 1: Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente\n"
        + "Si la respuesta es afirmativa marque 1 \n"
        + "Si la respuesta es negativa marque 2");
    int preguntaUno = sc.nextInt();
    if (preguntaUno == 1) {
      puntuacion = puntuacion + 3;
    }
    System.out.println("Pregunta 2: Ha aumentado sus gastos de vestuario\n"
        + "Si la respuesta es afirmativa marque 1 \n"
        + "Si la respuesta es negativa marque 2");
    int preguntaDos = sc.nextInt();
    if (preguntaDos == 1) {
      puntuacion = puntuacion + 3;
    }
    System.out.println("Pregunta 3: Ha perdido el interés que mostraba anteriormente por ti\n"
        + "Si la respuesta es afirmativa marque 1 \n"
        + "Si la respuesta es negativa marque 2");
    int preguntaTres = sc.nextInt();
    if (preguntaTres == 1) {
      puntuacion = puntuacion + 3;
    }
    System.out.println("Pregunta 4: Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se"
        + "arregla el pelo y se asea con más frecuencia (si es mujer)\n"
        + "Si la respuesta es afirmativa marque 1 \n"
        + "Si la respuesta es negativa marque 2");
    int preguntaCuatro = sc.nextInt();
    if (preguntaCuatro == 1) {
      puntuacion = puntuacion + 3;

    }

    System.out.println("Pregunta 5: No te deja que mires la agenda de su teléfono móvil\n"
        + "Si la respuesta es afirmativa marque 1 \n"
        + "Si la respuesta es negativa marque 2");
    int preguntaCinco = sc.nextInt();
    if (preguntaCinco == 1) {
      puntuacion = puntuacion + 3;
    }

    System.out.println("Pregunta 6: A veces tiene llamadas que dice no querer contestar cuando estás tú delante \n"
        + "Si la respuesta es afirmativa marque 1 \n"
        + "Si la respuesta es negativa marque 2");
    int preguntaSeis = sc.nextInt();
    if (preguntaSeis == 1) {
      puntuacion = puntuacion + 3;
    }

    System.out.println("Pregunta 7: Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a\n"
        + "Si la respuesta es afirmativa marque 1 \n"
        + "Si la respuesta es negativa marque 2");
    int preguntaSiete = sc.nextInt();
    if (preguntaSiete == 1) {
      puntuacion = puntuacion + 3;
    }
    System.out.println("Pregunta 8: Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo\n"
        + "Si la respuesta es afirmativa marque 1 \n"
        + "Si la respuesta es negativa marque 2");
    int preguntaOcho = sc.nextInt();
    if (preguntaOcho == 1) {
      puntuacion = puntuacion + 3;
    }
    System.out.println("Pregunta 9: Has notado que últimamente se perfuma más\n"
        + "Si la respuesta es afirmativa marque 1 \n"
        + "Si la respuesta es negativa marque 2");
    int preguntaNueve = sc.nextInt();
    if (preguntaNueve == 1) {
      puntuacion = puntuacion + 3;
    }
    System.out.println("Pregunta 10: Se confunde y te dice que ha estado en sitios donde no ha ido contigo\n"
        + "Si la respuesta es afirmativa marque 1 \n"
        + "Si la respuesta es negativa marque 2");
    int preguntaDiez = sc.nextInt();
    if (preguntaDiez == 1) {
      puntuacion = puntuacion + 3;
    }
    if (puntuacion >= 0 && puntuacion <= 10) {
      System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
    } else if (puntuacion >= 11 && puntuacion <= 22) {
      System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será\n"
          + " algo sin importancia. No bajes la guardia");
    } else if (puntuacion >= 22 && puntuacion <= 30) {
      System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra\n"
          + "persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
    }
    sc.close();
  }

}
