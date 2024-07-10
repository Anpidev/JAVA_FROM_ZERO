package numeros_aleatorios;

import java.util.Scanner;

/**
 * Ejercicio 6 Escribe un programa que piense un número al azar entre 0 y 100.
 * El usuario de- be adivinarlo y tiene para ello 5 oportunidades. Después de
 * cada intento fallido, el programa dirá cuántas oportunidades quedan y si el
 * número introducido es menor o mayor que el número secreto.
 *
 * @author angelaruiz
 */
public class Num6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intentos = 5;
        int numero = (int) (Math.random() * 100);
        while (intentos > 0) {

            System.out.println("Introduzca un número entre 0 y 100");
            int numeroIntroducido = sc.nextInt();
            if (numeroIntroducido != numero) {
                intentos--;
                if (numeroIntroducido > numero) {
                    System.out
                            .println("Lo siento, ha introducido un número mayor. Le quedan " + intentos + " intentos");
                } else {
                    System.out
                            .println("Lo siento, ha introducido un número menor. Le quedan " + intentos + " intentos");
                }

            } else {
                intentos = 0;
                System.out.println("Enhorabuena ha acertado el número");
            }

        }

        sc.close();
    }
}
