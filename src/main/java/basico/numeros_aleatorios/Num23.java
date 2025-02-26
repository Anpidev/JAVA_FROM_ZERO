package basico.numeros_aleatorios;

/**
 * Ejercicio 23 Las caras de un dado de poker tienen las siguientes figuras: As,
 * K, Q, J, 7 y 8. Escribe un programa que genere de forma aleatoria la tirada
 * de cinco dados. Ejemplo 1: Q J 7 J As Ejemplo 2: K 8 J As 7
 *
 * @author angelaruiz
 */
public class Num23 {

    public static void main(String[] args) {

        String cartas = " ";

        for (int i = 0; i < 5; i++) {
            int valorCartas = (int) (Math.random() * 6);

            switch (valorCartas) {
                case 0:
                    cartas = "As";
                    break;
                case 1:
                    cartas = "K";
                    break;
                case 2:
                    cartas = "Q";
                    break;
                case 3:
                    cartas = "J";
                    break;
                case 4:
                    cartas = "7";
                    break;
                case 5:
                    cartas = "8";
                    break;
                default:
                    break;
            }
            System.out.print(cartas + " ");
        }
    }
}
