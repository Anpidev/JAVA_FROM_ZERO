package numeros_aleatorios;

import java.util.Scanner;

/**
 * Ejercicio 14 Realiza un programa que haga justo lo contrario a lo que hace el
 * ejercicio 6. El programa intentará adivinar el número que estás pensando - un
 * número entre 0 y 100 - teniendo para ello 5 oportunidades. En cada intento
 * fallido, el programa debe preguntar si el número que estás pensando es mayor
 * o menor que el que te acaba de decir.
 *
 * @author angelaruiz
 */
public class Num14 {

    public static void main(String[] args) {

        System.out.println("Voy a adivinar que número estás pensando entre el 0 y 100");
        System.out.println("Ingrese el número pensado");
        Scanner sc = new Scanner(System.in);
        int numeroPensado = sc.nextInt();
        sc.close();

        int contador = 0;
        do {
            int numeroAdivinado = (int) (Math.random() * 100);
            if (numeroAdivinado == numeroPensado) {
                System.out.println("He adivinado el número que has pensado y es " + numeroAdivinado);
                break;
            } else {
                System.out.println("El número es " + ((numeroPensado > numeroAdivinado) ? "mayor" : "menor")
                        + ". Sigo intentándolo."); // OPERACION TERNARIA
                contador++;
            }

            if (contador == 5) {
                System.out.println("Ha agotado los cinco intentos");
            }

        } while (contador < 5);
    }
}
