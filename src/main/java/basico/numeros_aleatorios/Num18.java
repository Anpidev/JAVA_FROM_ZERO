package numeros_aleatorios;

/**
 * Ejercicio 18 Sinestesio y Casilda van a pintar los tres dormitorios de su
 * casa, quieren sustituir el color blanco por colores más alegres. Realiza un
 * programa que genere de forma aleatoria una secuencia de tres colores
 * aleatorios (uno para cada dormitorio) de tal forma que no se repita ninguno.
 * Los colores entre los que debe elegir el programa son los siguientes: rojo,
 * azul, verde, amarillo, violeta y naranja.
 *
 * @author angelaruiz
 */
public class Num18 {

    public static void main(String[] args) {

        int valorColor1;
        int valorColor2;
        int valorColor3;
        String color1 = " ";
        String color2 = " ";
        String color3 = " ";

        do {
            valorColor1 = (int) (Math.random() * 6);
            valorColor2 = (int) (Math.random() * 6);
            valorColor3 = (int) (Math.random() * 6);

        } while (valorColor1 == valorColor2 || valorColor2 == valorColor3 || valorColor1 == valorColor3);

        for (int i = 0; i < 3; i++) {
            String color = "";
            int valor = 0;

            switch (i) {
                case 0:
                    valor = valorColor1;
                    break;
                case 1:
                    valor = valorColor2;
                    break;
                case 2:
                    valor = valorColor3;
                    break;
                default:
            }

            switch (valor) {
                case 0:
                    color = "rojo";
                    break;
                case 1:
                    color = "azul";
                    break;
                case 2:
                    color = "verde";
                    break;
                case 3:
                    color = "amarillo";
                    break;
                case 4:
                    color = "violeta";
                    break;
                case 5:
                    color = "naranja";
                    break;
                default:
                    break;

            }

            switch (i) {
                case 0:
                    color1 = color;
                    break;
                case 1:
                    color2 = color;
                    break;
                case 2:
                    color3 = color;
                    break;
                default:
            }
        }

        System.out.print("Las habitaciones van a ser de: " + color1 + ", " + color2 + ", " + color3);
    }
}
