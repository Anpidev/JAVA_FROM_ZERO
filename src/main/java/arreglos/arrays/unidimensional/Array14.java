package arreglos.arrays.unidimensional;

import java.util.Scanner;

public class Array14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String colores[] = { "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado" };
        int contadorColor = 0;
        String palabras[] = new String[8];
        String mix[] = new String[8];

        System.out.println("Introduzca 8 palabras:");

        // Leer palabras e identificar colores
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            palabras[i] = sc.nextLine();

            for (String color : colores) {
                if (palabras[i].equalsIgnoreCase(color)) {
                    mix[contadorColor++] = palabras[i];
                }
            }
        }

        // Imprimir colores
        System.out.println("Palabras ordenadas:");
        for (int i = 0; i < contadorColor; i++) {
            System.out.print(mix[i] + " ");
        }

        // Imprimir palabras restantes
        for (int i = 0; i < palabras.length; i++) {
            boolean esColor = false;

            for (String color : colores) {
                if (palabras[i].equalsIgnoreCase(color)) {
                    esColor = true;
                    break;
                }
            }

            if (!esColor) {
                System.out.print(palabras[i] + " ");
            }
        }

        sc.close();
    }
}
