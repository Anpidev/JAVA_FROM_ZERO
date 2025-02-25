package arreglos.arrays.bidimensional;

/**
 * Realiza un programa que calcule la estatura media, mínima y máxima en
 * centímetros de personas de diferentes países. El array que contiene los
 * nombres de los paises es el siguiente: pais = {“España”, “Rusia”, “Japón”,
 * “Australia”}. Los datos sobre las estaturas se deben simular mediante un
 * array de 4 filas por 10 columnas con números aleatorios generados al azar
 * entre
 * 140 y 210. Los decimales de la media se pueden despreciar. Los nombres de
 * los países se deben mostrar utilizando el array de países (no se pueden
 * escribir
 * directamente).
 * Ejemplo:
 * MED MIN MAX
 * España: 178 165 148 185 155 141 165 149 155 201 | 164 141 201
 * Rusia: 179 189 208 167 186 174 152 192 173 179 | 179 152 179
 * Japón: 173 182 168 170 181 197 146 168 166 177 | 172 146 177
 * Australia: 172 170 187 186 197 143 190 199 187 191 | 182 143 191
 */

public class Arraybi12 {
    public static void main(String[] args) {
// Primer array de países
String paises[] = {"España", "Rusia", "Japón", "Australia"};

// Array de estaturas
int estatura[][] = new int[4][10];

// Variables
double media = 0;
int maximo = Integer.MIN_VALUE;
int minimo = Integer.MAX_VALUE;
int contador = 0;
int suma = 0;

// Encabezado
System.out.printf("%-15s%-51s%-5s%-4s%-4s\n", "PAÍS", "| ESTATURAS", "|MED", "MIN", "MAX");

// Bucle para recorrer países
for (int i = 0; i < estatura.length; i++) {
    // Imprimir nombre del país
    System.out.printf("%-15s|", paises[i]);

    // Bucle para generar estaturas y calcular MED, MIN, MAX
    for (int j = 0; j < estatura[i].length; j++) {
        estatura[i][j] = (int) (Math.random() * 140 + 70);
        if (estatura[i][j] > maximo) {
            maximo = estatura[i][j];
        }
        if (estatura[i][j] < minimo) {
            minimo = estatura[i][j];
        }
        contador++;
        suma += estatura[i][j];
        media = (double) suma / contador;
        System.out.printf("%-5d", estatura[i][j]);
    }

    // Imprimir MED, MIN, MAX
    System.out.printf("|%-4d%-4d%-4d\n", (int) media, minimo, maximo);

    // Reiniciar variables para el próximo país
    media = 0;
    maximo = Integer.MIN_VALUE;
    minimo = Integer.MAX_VALUE;
    contador = 0;
    suma = 0;
}
}
}