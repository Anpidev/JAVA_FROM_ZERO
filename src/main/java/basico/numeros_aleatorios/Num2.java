package basico.numeros_aleatorios;

/**
 * Ejercicio 2 Realiza un programa que muestre al azar el nombre de una carta de
 * la baraja francesa. Esta baraja está dividida en cuatro palos: picas,
 * corazones, diamantes y tréboles. Cada palo está formado por 13 cartas, de las
 * cuales 9 cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J,
 * Q, K y A (que sería el 1). Para convertir un número en una cadena de
 * caracteres podemos usar String.valueOf(n).
 *
 * @author angelaruiz
 */
public class Num2 {

    public static void main(String[] args) {
        // Generar valores aleatorios para el palo y la carta
        int valorBaraja = (int) (Math.random() * 4 + 1);
        int valorCarta = (int) (Math.random() * 13 + 1);

        // Variables para almacenar el nombre del palo y la carta
        String baraja = "";
        String carta = "";

        // Asignar el nombre del palo según el valor generado
        switch (valorBaraja) {
            case 1:
                baraja = "picas";
                break;
            case 2:
                baraja = "corazones";
                break;
            case 3:
                baraja = "diamantes";
                break;
            case 4:
                baraja = "tréboles";
                break;
        }

        // Asignar el nombre de la carta según el valor generado
        switch (valorCarta) {
            case 1:
                carta = "A";
                break;
            case 11:
                carta = "J";
                break;
            case 12:
                carta = "Q";
                break;
            case 13:
                carta = "K";
                break;
            default:
                carta = String.valueOf(valorCarta);
                break;
        }

        // Mostrar el resultado
        System.out.println("Le ha tocado el " + carta + " de la baraja " + baraja);
    }
}
