package basico.numeros_aleatorios;

/**
 * Ejercicio 15 Realiza un generador de melodía con las siguientes condiciones:
 * a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa,
 * sol, la y si. b) Una melodía está formada por un número aleatorio de notas
 * mayor o igual a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12...).
 * c) Cada grupo de 4 notas será un compás y estará separado del siguiente
 * compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se
 * marca con dos barras. d) La última nota de la melodía debe coincidir con la
 * primera. Ejemplo 1: do mi fa mi | si do sol fa | fa re si do | sol mi re do
 * || Ejemplo 2: la re mi sol | fa mi mi si | do la sol fa | fa re si sol | do
 * sol mi re | fa la do la ||
 *
 * @author angelaruiz
 */
public class Num15 {

    public static void main(String[] args) {
        int longitudMelodia = (int) (Math.random() * 7 + 1) * 4; // Múltiplo de 4 entre 4 y 28
        // CON CLASE RANDOM SERIA Random random = new Random();
        // int longitudMelodia = random.nextInt(25) + 4; (Del 4 al 28)

        String melodia = "";

        for (int i = 1; i <= longitudMelodia; i++) {
            int valorNota = (int) (Math.random() * 7);
            String nota = "";

            switch (valorNota) {
                case 0:
                    nota = "do";
                    break;
                case 1:
                    nota = "re";
                    break;
                case 2:
                    nota = "mi";
                    break;
                case 3:
                    nota = "fa";
                    break;
                case 4:
                    nota = "sol";
                    break;
                case 5:
                    nota = "la";
                    break;
                case 6:
                    nota = "si";
                    break;
            }

            melodia += nota;

            // Si es múltiplo de 4, añadir la barra vertical |
            if (i % 4 == 0 && i != longitudMelodia) {
                melodia += " | ";
            } else {
                melodia += " ";
            }
        }

        System.out.println(melodia);
    }
}
