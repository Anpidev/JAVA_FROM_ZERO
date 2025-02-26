package basico.numeros_aleatorios;

/**
 * Ejercicio 5
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 * separados por espacios. Muestra también el máximo, el mínimo y la media
 * de esos números.
 * 
 * @author angelaruiz
 */
public class Num5 {

    public static void main(String[] args) {
        int suma = 0;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        for (int i = 0; i < 50; i++) {
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
