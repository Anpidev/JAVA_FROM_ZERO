package arrays.bidimensional;

/*
 * Ejercicio 9
Realiza un programa que sea capaz de rotar todos los elementos de una matriz
cuadrada una posición en el sentido de las agujas del reloj. La matriz debe tener
12 filas por 12 columnas y debe contener números generados al azar entre 0 y
100. Se debe mostrar tanto la matriz original como la matriz resultado, ambas
con los números convenientemente alineados.
 */
public class Arraybi9 {
    public static void main(String[] args) {

        // Primera matriz
        int original[][] = new int[12][12];

        // Rellenar primera matriz e impresion
        System.out.println("La matriz original es la siguiente");
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[i].length; j++) {
                original[i][j] = (int) (Math.random() * 101);
                System.out.printf("%5d ", original[i][j]);
            }
            System.out.println();
        }
        

        // Rotación de la matriz
        System.out.println("\nLa matriz girada es la siguiente: ");
        int filas = original.length;
        int columnas = original[0].length;

        for (int capa = 0; capa < filas / 2; capa++) {
            int limiteSuperior = filas - 1 - capa;
            int limiteDerecho = columnas - 1 - capa;

            // Rotación por arriba
            for (int i = capa; i < limiteDerecho; i++) {
                int temp = original[capa][i + 1];
                original[capa][i + 1] = original[capa][i];
                original[capa][i] = temp;
            }

            // Rotación por la derecha
            for (int i = capa; i < limiteSuperior; i++) {
                int temp = original[i + 1][limiteDerecho];
                original[i + 1][limiteDerecho] = original[i][limiteDerecho];
                original[i][limiteDerecho] = temp;
            }

            // Rotación por abajo
            for (int i = limiteDerecho; i > capa; i--) {
                int temp = original[limiteSuperior][i - 1];
                original[limiteSuperior][i - 1] = original[limiteSuperior][i];
                original[limiteSuperior][i] = temp;
            }

            // Rotación por la izquierda
            for (int i = limiteSuperior; i > capa; i--) {
                int temp = original[i - 1][capa];
                original[i - 1][capa] = original[i][capa];
                original[i][capa] = temp;
            }
        }

        // Imprimir el resultado
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[i].length; j++) {
                System.out.printf("%5d ", original[i][j]);
            }
            System.out.println();
        }
    }
}