package arreglos.arrays.unidimensional;
import  java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Ejercicio 20
Implementa un programa que calcule la denominación ordinal de los reyes de
una secuencia histórica. El programa solicitará la cantidad de reyes que se
van a introducir, y a continuación recibirá los nombres de los reyes. Presentará
por pantalla dichos nombres, pero colocándoles el ordinal correspondiente. Así,
por ejemplo, si hay dos Felipes en los nombres de los reyes, el primero debería
aparecer como Felipe 1o y el segundo como Felipe 2o.
 */
public class Array20 {
    public static void main(String[] args) {
        // Array de reyes predefinido
        String reyes[] = {"Isabel", "Fernando", "Juana", "Felipe", "Carlos", "Felipe", "Felipe", "Felipe", "Carlos",
                "Felipe", "Luis", "Felipe", "Fernando", "Carlos", "Carlos", "Fernando", "Jose", "Fernando", "Isabel",
                "Amadeo", "Alfonso", "Alfonso", "Juan Carlos", "Felipe"};

        // Pedir datos por pantalla
        Scanner sc = new Scanner(System.in);
        int cantidad = 0;

        try {
            System.out.println("Introduzca la cantidad de reyes");
            cantidad = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese un número entero válido.");
            sc.close();
            return;
        }

        // Array para almacenar nombres de reyes solicitados
        String reyesSolicitados[] = new String[cantidad];
        int contadores[] = new int[cantidad];

        // Comparar y mostrar los nombres con su ordinal correspondiente 
        
        System.out.println("Vaya introduciendo el nombre del rey y pulsando INTRO.");
        for (int i = 0; i < cantidad; i++) {
            boolean existe = false;

            // Leer nombres de reyes
            do {
                try {
                   
                    reyesSolicitados[i] = sc.nextLine();

                    for (int j = 0; j < reyes.length; j++) {
                        if (reyesSolicitados[i].equalsIgnoreCase(reyes[j])) {
                            existe = true;
                            break;
                        }
                    }

                    if (!existe) {
                        System.out.println("El rey introducido no existe. Inténtelo de nuevo.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error: Ingrese un nombre válido.");
                    sc.nextLine(); // Limpiar el búfer del scanner
                }
            } while (!existe);

            // Contar ocurrencias anteriores del mismo rey
            for (int k = 0; k < i; k++) {
                if (reyesSolicitados[i].equalsIgnoreCase(reyesSolicitados[k])) {
                    contadores[i]++;
                }
            }
        }

        // Mostrar el array con el contador correcto
        System.out.println("Array final:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(reyesSolicitados[i] + " " + (contadores[i] + 1) + "o");
        }

        sc.close();
    }
}