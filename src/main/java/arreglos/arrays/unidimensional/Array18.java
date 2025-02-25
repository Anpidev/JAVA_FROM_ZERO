package arrays.unidimensional;

/**
 * Ejercicio 18
 * Realiza un programa que genere 10 números enteros aleatorios entre 0 y 200
 * ambos incluidos y que los almacene en un array. A continuación, el programa
 * debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente
 * el
 * programa debe colocar de forma alterna y en orden los menores o iguales de
 * 100 y los mayores de 100: primero original, luego mayor, luego original,
 * luego
 * mayor... Cuando se acaben los menores o los mayores, se completará con los
 * números que queden.
 */
public class Array18 {

    public static void main(String[] args) {
        // Creación de arrays
        int original[] = new int[10];
        int ordenado[] = new int[10];
        int menor[] = new int[10];
        int mayor[] = new int[10];
        int contadorMenor = 0;

        // Recorrido e impresión del array original
        for (int i = 0; i < original.length; i++) {
            original[i] = (int) (Math.random() * 201);
            System.out.println("Posición " + i + ": " + original[i]);
        }

        // Separar menores y mayores
        for (int i = 0; i < original.length; i++) {
            if (original[i] <= 100) {
                menor[contadorMenor] = original[i];
                contadorMenor++;
            } else {
                mayor[i - contadorMenor] = original[i];
            }
        }

        // Ordenar array menor
        for (int i = 0; i < contadorMenor - 1; i++) {
            for (int j = 0; j < contadorMenor - i - 1; j++) {
                if (menor[j] > menor[j + 1]) {
                    // Intercambiar elementos si están en el orden incorrecto
                    int temp = menor[j];
                    menor[j] = menor[j + 1];
                    menor[j + 1] = temp;
                }
            }
        }

        // Ordenar array mayor
        for (int i = 0; i < mayor.length - contadorMenor - 1; i++) {
            for (int j = 0; j < mayor.length - contadorMenor - i - 1; j++) {
                if (mayor[j] > mayor[j + 1]) {
                    // Intercambiar elementos si están en el orden incorrecto
                    int temp = mayor[j];
                    mayor[j] = mayor[j + 1];
                    mayor[j + 1] = temp;
                }
            }
        }

        // Llenar array ordenado de forma alterna
        for (int i = 0, j = 0, k = 0; i < 10; i++) {
            if (i % 2 == 0) {
                ordenado[i] = (j < contadorMenor) ? menor[j++] : mayor[k++];
            } else {
                ordenado[i] = (k < mayor.length - contadorMenor) ? mayor[k++] : menor[j++];
            }
        }

        // Mostrar el array ordenado
        System.out.println("Array ordenado:");
        for (int i = 0; i < ordenado.length; i++) {
            System.out.println("Posición " + i + ": " + ordenado[i]);
        }
    }
}