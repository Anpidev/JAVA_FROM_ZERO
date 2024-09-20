package condicionales;

import java.util.Scanner;

/**
 * Ejercicio 12 Realiza un minicuestionario con 10 preguntas tipo test sobre las
 * asignaturas que se imparten en el curso. Cada pregunta acertada sumará un
 * punto. El programa mostrará al final la calificación obtenida. Pásale el
 * minicuestionario a tus compañeros y pídeles que lo hagan para ver qué tal
 * andan de conocimientos en las diferentes asignaturas del curso.
 *
 * @author angelaruiz
 */
public class Condicionales12 {

  public static void main(String[] args) {

    int puntuacion = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("CUESTIONARIO DAM");

    System.out.println("Pregunta 1: ¿Qué es la programación orientadas a objetos?\n"
        + "1-Una estructura de datos \n"
        + "2-Se basa en la programación lineal \n3-Es un paradigma de la programación\n"
        + "Elija la correcta del 1 al 3 ");
    int preguntaUno = sc.nextInt();
    if (preguntaUno == 3) {
      ++puntuacion;
      System.out.println("Respuesta correcta");
    } else {
      System.out.println("Respuesta incorrecta");
    }
    System.out.println("Pregunta 2: Concepto de clases\n"
        + "1-La clase es un espacio donde conviven las entidades "
        + "\n2-La clase es una plantilla donde se define como van a ser los objetos de un determinado tipo \n"
        + "3-La clase es una enumeración de eventos que debe ejecutarse\n"
        + "Elija la correcta del 1 al 3 ");
    int preguntaDos = sc.nextInt();
    if (preguntaDos == 2) {
      ++puntuacion;
      System.out.println("Respuesta correcta");
    } else {
      System.out.println("Respuesta incorrecta");
    }
    System.out.println("Pregunta 3: ¿Qué son los atributos?\n"
        + "1-Son las características que una entidad posee y seran independientes por cada objeto que se cree \n"
        + "2-Son variables que se pueden definir en el transcurso del desarrollo"
        + " \n3-Son datos que siempre son públicos\n"
        + "Elija la correcta del 1 al 3");
    int preguntaTres = sc.nextInt();
    if (preguntaTres == 1) {
      ++puntuacion;
      System.out.println("Respuesta correcta");
    } else {
      System.out.println("Respuesta incorrecta");
    }
    System.out.println("Pregunta 4: ¿Qué son los métodos?\n"
        + "1-Son declaraciones de funciones de tipo protegidas que solo pueden ser accedidos desde el constructos de la clase\n"
        + "2-Son las funcionalidades asocidadas a cada entidad representada en la clase e instanciadas en objetos para su uso"
        + " \n3-Son funciones externas que se agregan al programa para poder ejecutar procesos complejos\n"
        + "Elija la correcta del 1 al 3 ");
    int preguntaCuatro = sc.nextInt();
    if (preguntaCuatro == 2) {
      ++puntuacion;
      System.out.println("Respuesta correcta");
    } else {
      System.out.println("Respuesta incorrecta");
    }
    System.out.println("Pregunta 5: Concepto de instancia\n"
        + "1-Es el acto de generar clases a partir de un objeto\n"
        + "2-Es el acto de generar un objeto a partir de una clase"
        + " \n3-Es el acto de generar objetos a partir de clases con datos idénticos\n"
        + "Elija la correcta del 1 al 3 ");
    int preguntaCinco = sc.nextInt();
    if (preguntaCinco == 2) {
      ++puntuacion;
      System.out.println("Respuesta correcta");
    } else {
      System.out.println("Respuesta incorrecta");
    }
    System.out.println("Pregunta 6: Concepto de encapsulación\n"
        + "1-Habilita la consulta y edición de sus datos unicamente por métodos privados \n"
        + "2-Contiene toda la información importante de un objeto dentro del mismo y sólo expone"
        + "la información seleccionada al mundo exterior "
        + "\n3-Protege los datos de atributos que solo pueden ser accedidos mediante métodos protegidos\n"
        + "Elija la correcta del 1 al 3 ");
    int preguntaSeis = sc.nextInt();
    if (preguntaSeis == 2) {
      ++puntuacion;
      System.out.println("Respuesta correcta");
    } else {
      System.out.println("Respuesta incorrecta");
    }
    System.out.println("Pregunta 7: Concepto de objeto\n"
        + "1-Es la instancia de una clase dónde tiene definición especifica con datos y funcionalidades \n"
        + "2-El objeto, sus atributos y métodos son solo de lectura"
        + "\n3El objeto tiene independencia propia y no se basa en una clase para crearse\n"
        + "Elija la correcta del 1 al 3 ");
    int preguntaSiete = sc.nextInt();
    if (preguntaSiete == 1) {
      ++puntuacion;
      System.out.println("Respuesta correcta");
    } else {
      System.out.println("Respuesta incorrecta");
    }
    System.out.println("Pregunta 8: Claves de la POO\n"
        + "1-Ver al mundo con funciones y varibles \n"
        + "2-Interacción entre los objetos "
        + "\n3-Inspiración en la forma como percibimos el mundo\n"
        + "Elija la correcta del 1 al 3 ");
    int preguntaOcho = sc.nextInt();
    if (preguntaOcho == 3) {
      ++puntuacion;
      System.out.println("Respuesta correcta");
    } else {
      System.out.println("Respuesta incorrecta");
    }
    System.out.println("Pregunta 9: Se utiliza para restringir el ámbito de un miembro de la estructura,"
        + "solo pueden ser accedidos por unas pocas categorias de funciones\n"
        + "1-Palabra reservada public \n"
        + "2-Palabra reservad private "
        + "\n3-Palabra reservada static\n"
        + "Elija la correcta del 1 al 3");
    int preguntaNueve = sc.nextInt();
    if (preguntaNueve == 2) {
      ++puntuacion;
      System.out.println("Respuesta correcta");
    } else {
      System.out.println("Respuesta incorrecta");
    }
    System.out.println("Pregunta 10: Son las entidades reales que serán manipuladas en un programa informático\n"
        + "1-Constructor \n"
        + "2-Clases "
        + "\n3-Objetos\n"
        + "Elija la correcta del 1 al 3");
    int preguntaDiez = sc.nextInt();
    if (preguntaDiez == 3) {
      ++puntuacion;
      System.out.println("Respuesta correcta");
    } else {
      System.out.println("Respuesta incorrecta");
    }
    System.out.println("Su puntuación es: " + puntuacion);
    sc.close();
  }

}
