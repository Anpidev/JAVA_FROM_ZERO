package bucles;
/*En este ejercicio se trata de adivinar en el menor número de intentos posibles un número entero
aleatorio entre 1 y 100 generado por el programa.
Al ejecutar el programa, este generará un número aleatorio entre 1 y 100 que el usuario no
sabrá. A continuación, el programa pedirá la introducción de un número entero entre 1 y 100
por consola.
Si el número introducido por el usuario es mayor que el número aleatorio generado por el
programa, saldrá un mensaje por consola indicando que el número es menor.
Si el numero introducido por el usuario es menor que el número aleatorio generado por el
programa, saldrá un mensaje por consola indicando que el número es mayor.
El proceso se repetirá indefinidamente hasta que averigüemos cuál es el número generado
aleatoriamente por el programa.
Una vez acertado, debe imprimir en consola un mensaje de “Correcto!” e indicar el nº de
intentos consumidos para acertar con el número aleatorio */
import javax.swing.JOptionPane;

public class EjercicioWhile {
public static void main(String[] args) {
   

    int numeroCorrecto = (int)(Math.random() * 100) + 1;
    int numeroIntroducido=0;
    int contador=0;

    while(numeroIntroducido!=numeroCorrecto){
       
        numeroIntroducido=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número entre 1 y 100"));

        if (numeroIntroducido>numeroCorrecto) {
            System.out.println("El número introducido es mayor");
        }
        else if (numeroIntroducido<numeroCorrecto) {
            System.out.println("El número introducido es menor");
        }
            contador++;
    }
    System.out.println("Número correcto. Ha tenido "+contador+" intentos.");
}
}
