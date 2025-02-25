package arreglos.arrays.bidimensional;
/**
 * Realiza un programa que muestre por pantalla un array de 9 filas por 9
columnas relleno con números aleatorios entre 500 y 900. A continuación, el
programa debe mostrar los números de la diagonal que va desde la esquina
inferior izquierda a la esquina superior derecha, así como el máximo, el mínimo
y la media de los números que hay en esa diagonal.
 */
public class Arraybi11 {
    public static void main(String[] args) {
          // variables
          int maximo = Integer.MIN_VALUE;
          int minimo = Integer.MAX_VALUE;
          int suma = 0;
          int contador = 0;
          int sumaDiagonal=0;
          double media = 0;
  
          // Array
          int numero[][] = new int[9][9];
  
          // Relleno del array y primera impresion
          for (int i = 0; i < numero.length; i++) {
  
              for (int j = 0; j < numero[i].length; j++) {
                  numero[i][j] = (int) (Math.random() * 500 + 400);
                  System.out.printf("|%2d|", numero[i][j]);
  
              }
              System.out.println();
  
          }

          //Ejecución de condiciones
          for (int i = 0; i < numero.length; i++) {
  
            for (int j = 0; j < numero[i].length; j++) {

                if (numero[i][j]>maximo) {
                   maximo= numero[i][j];
                }
                if (numero[i][j]<minimo) {
                   minimo= numero[i][j];
                }
                if (i + j == numero.length - 1) {
                    contador++;
                    sumaDiagonal+=numero[i][j];
                    System.out.print(numero[i][j]+" ");
                }

            }
           
        }
        media=(double)sumaDiagonal/contador;

System.out.printf("%nEl máximo número del array es %d , el minimo %d y la media es %.2f",maximo,minimo,media);
    }
}
