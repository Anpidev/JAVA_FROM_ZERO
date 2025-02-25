package arreglos.arrays.unidimensional;
/*En este ejercicio debes crear un array de 100 elementos que guarde en cada una de las
posiciones un no aleatorio entre 1 y 100. El programa debe imprimir en consola todos los valores
almacenados en el array. Utiliza un bucle for-each para leer los valores almacenados. (Debes
utilizar el método random() de la clase Math). */

public class EjercicioArray3 {
    public static void main(String[] args) {
        // CLASE RANDOM Random num= new Random();

        int numeros[] = new int[100];

        for (int i = 0; i < 100; i++) {
            // CLASE RANDOM numeros [i]= num.nextInt(100)+1;
            numeros[i] = (int) (Math.random() * 100) + 1;
        }

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }

}
