package arrays.bidimensional;
/*
 * Ejercicio 5
Realiza un programa que rellene un array de 6 filas por 10 columnas con
números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
continuación, el programa deberá dar la posición tanto del máximo como del
mínimo.
 */
public class Arraybi5 {
    public static void main(String[] args) {
        int numero[][]= new int[6][10]; // 6 filas x 10 columnas
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                numero[i][j]=(int)(Math.random()*900+100);
                System.out.print(numero[i][j]+" ");
            
        }
    }

    for (int i = 0; i < 6; i++) {
        for (int j = 0; j < 10; j++) {
            if (numero [i][j]>maximo) {
                maximo=numero [i][j];
            } 
            else if (numero [i][j]<minimo) {
                minimo=numero [i][j];
            }
        }
       
    } 
    System.out.println("\nEl número máximo del array es "+maximo+ " y el mínimo "+minimo);
}
}