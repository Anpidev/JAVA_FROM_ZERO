package basico.numeros_aleatorios;

/**
 * Ejercicio 11 Escribe un programa que muestre 20 notas generadas al azar. Las
 * notas deben aparecer de la forma: suspenso, suficiente, bien, notable o
 * sobresaliente. Al final aparecerá el número de suspensos, el número de
 * suficientes, el número de bienes, etc.
 *
 * @author angelaruiz
 */
public class Num11 {

    public static void main(String[] args) {

        // Declaracion de variables
        int suspenso = 0;
        int suficiente = 0;
        int bien = 0;
        int notable = 0;
        int sobresaliente = 0;
        String resultado = "";

        // Generamos el bucle que pida las 20 notas con notas random
        for (int i = 0; i < 20; i++) {
            double nota = (Math.random() * 10);
            if (nota >= 0 && nota < 5) {
                resultado = "suspenso";
                suspenso++;
            }
            if (nota >= 5 && nota < 6) {
                resultado = "suficiente";
                suficiente++;
            }
            if (nota >= 6 && nota < 7) {
                resultado = "bien";
                bien++;
            }
            if (nota >= 7 && nota < 9) {
                resultado = "notable";
                notable++;
            }
            if (nota >= 9 && nota <= 10) {
                resultado = "sibresaliente";
                sobresaliente++;
            }
            System.out.println(resultado);
        }
        System.out.printf("Se han sacado %d insuficientes, %d suficientes, %d bien, %d notables y %d sobresalientes",
                suspenso, suficiente, bien, notable, sobresaliente);
    }
}
