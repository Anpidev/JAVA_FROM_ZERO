package arreglos.arrays.unidimensional;
/*
 * Ejercicio 21
Escribe un programa que rellene un array de 15 elementos con números enteros
comprendidos entre 0 y 500 (ambos incluidos). A continuación, se mostrará el
array “cincuerizado”, según el siguiente criterio: si el número que hay en una
posición del array es múltiplo de 5, se deja igual, y si no, se cambia por el
siguiente múltiplo de 5 que exista a partir de él.
 */
public class Array21 {public static void main(String[] args) {
    int original[] = new int[15];
    int cincuerizado[] = new int[original.length];

    System.out.println("Array original");
    for (int i = 0; i < original.length; i++) {
        original[i] = (int) (Math.random() * 501);
        System.out.println(original[i]);
    }

    System.out.println("Nuevo array cincuerizado");
    for (int i = 0; i < original.length; i++) {
        if (original[i] % 5 == 0) {
            cincuerizado[i] = original[i];
        } else {
            // Encuentra el siguiente múltiplo de 5 a partir del número actual
            int siguienteMultiplo = original[i] + (5 - (original[i] % 5));
            cincuerizado[i] = siguienteMultiplo <= 500 ? siguienteMultiplo : original[i];
        }
        System.out.println(cincuerizado[i]);
    }
}
}