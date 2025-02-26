package basico.numeros_aleatorios;

/**
 * Ejercicio 3 Igual que el ejercicio anterior pero con la baraja española. Se
 * utilizará la baraja de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 *
 * @author angelaruiz
 */
public class Num3 {

    public static void main(String[] args) {

        // Generar valores aleatorios para el palo y la carta
        int paloAleatorio = (int) (Math.random() * 4 + 1);
        int numeroCartaAleatorio = (int) (Math.random() * 12 + 1);

        // Variables para almacenar el nombre del palo y la carta
        String palo = "";
        String carta = "";

        // Asignar el nombre del palo según el valor generado
        switch (paloAleatorio) {
            case 1:
                palo = "oros";
                break;
            case 2:
                palo = "copas";
                break;
            case 3:
                palo = "espadas";
                break;
            case 4:
                palo = "bastos";
                break;
        }

        // Asignar el nombre de la carta según el valor generado
        if (numeroCartaAleatorio != 8 && numeroCartaAleatorio != 9) {
            switch (numeroCartaAleatorio) {
                case 1:
                    carta = "as";
                    break;
                case 10:
                    carta = "sota";
                    break;
                case 11:
                    carta = "caballo";
                    break;
                case 12:
                    carta = "rey";
                    break;
                default:
                    carta = String.valueOf(numeroCartaAleatorio);
                    break;
            }

            // Mostrar el resultado
            System.out.println("Le ha tocado el " + carta + " de la baraja " + palo);
        } else {
            System.out.println("Error: carta errónea");
        }
    }
}
