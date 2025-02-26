package basico.numeros_aleatorios;

import java.util.Scanner;

/**
 * Ejercicio 27
 * Implementa el juego piedra, papel y tijera. Primero, el usuario introduce su
 * jugada y luego el ordenador genera al azar una de las opciones. Si el usuario
 * introduce una opción incorrecta, el programa deberá mostrar un mensaje de
 * error.
 * Ejemplo 1:
 * Turno del jugador (introduzca piedra, papel o tijera): papel
 * Turno del ordenador: papel
 * Empate
 * Ejemplo 2:
 * Turno del jugador (introduzca piedra, papel o tijera): papel
 * Turno del ordenador: tijera
 * Gana el ordenador
 * Ejemplo 3:
 * Turno del jugador (introduzca piedra, papel o tijera): piedra
 * Turno del ordenador: tijera
 * Gana el jugador
 * 
 * @author angelaruiz
 */
public class Num27 {
    public static void main(String[] args) {
        // Declaración de variables e inicializacion

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca piedra,papel o tijera: ");
        String tirada = sc.nextLine();
        sc.close();

        boolean correcto = tirada.equalsIgnoreCase("piedra") || tirada.equalsIgnoreCase("papel")
                || tirada.equalsIgnoreCase("tijera");
        String tiradaOrdenador = " ";
        int valorTirada = 0;
        int valorTiradaOrdenador = (int) (Math.random() * 3 + 1);
        String ganador = " ";

        // Ejecucion

        if (correcto) {

            switch (tirada) {
                case "piedra":
                    valorTirada = 1;
                    break;
                case "papel":
                    valorTirada = 2;
                    break;
                case "tijera":
                    valorTirada = 3;
                    break;
                default:
                    break;
            }

            switch (valorTiradaOrdenador) {
                case 1:
                    tiradaOrdenador = "piedra";
                    break;
                case 2:
                    tiradaOrdenador = "papel";
                    break;
                case 3:
                    tiradaOrdenador = "tijera";
                    break;

                default:
                    break;
            }
            if (valorTirada == valorTiradaOrdenador) {
                ganador = "Empate";

            } else if (valorTirada == 1 && valorTiradaOrdenador == 2 || valorTirada == 2 && valorTiradaOrdenador == 3
                    || valorTirada == 3 && valorTiradaOrdenador == 1) {
                ganador = "Gana el ordenador";
            } else {
                ganador = "Gana el jugador";
            }

            // Resolución
            System.out.println("Turno del jugador: " + tirada);
            System.out.println("Turno del ordenador: " + tiradaOrdenador);
            System.out.println(ganador);

        } else {
            System.out.println("Error, tirada mal introducida");
        }

        sc.close();
    }
}