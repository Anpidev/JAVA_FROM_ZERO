package basico.numeros_aleatorios;

/**
 * Ejercicio 25 Escribe un programa que muestre por pantalla 100 números enteros
 * separados por un espacio. Los números deben estar generados de forma
 * aleatoria en un rango entre 10 y 200 ambos incluidos. Los primos deben
 * aparecer entre almohadillas (p. ej. #19#) y los múltiplos de 5 entre
 * corchetes (p. ej. [25]).
 *
 * @author angelaruiz
 */
public class Num25 {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            int numero = (int) (Math.random() * 191) + 10;
            boolean esPrimo = true;

            if (numero < 2) {
                System.out.print(numero);
                esPrimo = false;
            } else {
                for (int j = 2; j <= Math.sqrt(numero); j++) { // Utilizar j <= Math.sqrt(numero) en lugar de j <=
                                                               // numero reduce la cantidad
                    // de iteraciones necesarias para verificar si un número es primo, lo que mejora
                    // la eficiencia del algoritmo.
                    if (numero % j == 0) {
                        System.out.print(numero);
                        esPrimo = false;
                        break;
                    }
                }
            }

            if (esPrimo) {
                System.out.print("#" + numero + "# ");
            } else if (numero % 5 == 0) {
                System.out.print("[" + numero + "] ");
            } else {
                System.out.print(numero + " ");
            }
        }
    }
}
