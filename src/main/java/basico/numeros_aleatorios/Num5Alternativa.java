package basico.numeros_aleatorios;

/**
 *
 * Ejemplo alternativo para calcular mínimo y máximo en un bucle de números
 * aleatorios. Muestra 50 números enteros aleatorios entre 100 y 199 (ambos
 * incluidos) separados por espacios. Muestra también el máximo, el mínimo y la
 * media de esos números.
 *
 */
public class Num5Alternativa {

    public static void main(String[] args) {
        int suma = 0;
        // Inicializar minimo y maximo con el primer número generado
        int primerNumero = (int) (Math.random() * 100 + 100);
        int minimo = primerNumero;
        int maximo = primerNumero;

        // Imprimir el primer número
        System.out.print(primerNumero + " ");
        suma += primerNumero;

        // Generar y procesar los siguientes 49 números
        for (int i = 1; i < 50; i++) {
            int numero = (int) (Math.random() * 100 + 100);
            System.out.print(numero + " ");

            // Calcular la suma
            suma += numero;

            // Actualizar máximo y mínimo
            maximo = Math.max(maximo, numero);
            minimo = Math.min(minimo, numero);
        }

        // Calcular la media
        double media = (double) suma / 50;

        // Mostrar resultados
        System.out.println("\nMáximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
        System.out.println("Media: " + media);
    }
}
