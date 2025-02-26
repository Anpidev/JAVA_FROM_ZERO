package basico.numeros_aleatorios;

/**
 * Ejercicio 12 Realiza un programa que llene la pantalla de caracteres
 * aleatorios (a lo Matrix) con el código ascii entre el 32 y el 126. Puedes
 * hacer casting con (char) para convertir un entero en un carácter.
 *
 * @author angelaruiz
 */
public class Num12 {

    public static void main(String[] args) {

        // Tamaño de la pantalla (ajusta según tu preferencia)
        int filas = 910;
        int columnas = 1024;

        // Llenar la pantalla de caracteres aleatorios
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                // Generar un carácter aleatorio entre ASCII 32 y 126
                char caracter = (char) (Math.random() * (126 - 32 + 1) + 32);
                System.out.print(caracter);
            }
            System.out.println(); // Nueva línea después de cada fila
        }
    }
}
