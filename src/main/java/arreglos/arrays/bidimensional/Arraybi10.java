package arreglos.arrays.bidimensional;

/**
 * Realiza un programa que muestre por pantalla un array de 10 filas por 10
 * columnas relleno con números aleatorios entre 200 y 300. A continuación, el
 * programa debe mostrar los números de la diagonal que va desde la esquina
 * superior izquierda a la esquina inferior derecha, así como el máximo, el
 * mínimo
 * y la media de los números que hay en esa diagonal.
 */
public class Arraybi10 {
    public static void main(String[] args) {

        // variables
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int suma = 0;
        int contador = 0;
        int sumaDiagonal=0;
        double media = 0;

        // Array
        int numero[][] = new int[10][10];

        // Relleno del array y primera impresion
        for (int i = 0; i < numero.length; i++) {

            for (int j = 0; j < numero[i].length; j++) {
                numero[i][j] = (int) (Math.random() * 200 + 100);
                System.out.printf("|%2d|", numero[i][j]);

            }
            System.out.println();

        }

        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < numero[i].length; j++) {

                if (numero[i][j] > maximo) {
                    maximo = numero[i][j];
                }
                if (numero[i][j] < minimo) {
                    minimo = numero[i][j];
                } 
                if (i == j) {
                    sumaDiagonal+=numero[i][j];
                    contador++;
                    System.out.print(numero[i][j]+" ");
                }

            }
           
        }
        media=(double)sumaDiagonal/contador;

System.out.printf("%nEl máximo número del array es %d , el minimo %d y la media es %.2f",maximo,minimo,media);
    }
}
